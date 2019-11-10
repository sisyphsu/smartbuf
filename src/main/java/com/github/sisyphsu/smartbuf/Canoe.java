package com.github.sisyphsu.smartbuf;

import com.github.sisyphsu.smartbuf.exception.CanoeClosedException;
import com.github.sisyphsu.smartbuf.reflect.TypeRef;
import com.github.sisyphsu.smartbuf.transport.Input;
import com.github.sisyphsu.smartbuf.transport.Output;

import java.io.IOException;

/**
 * Canoe wraps the "canoe" protocol, includes packet-mode and stream-mode.
 * <p>
 * In most cases, you can use {@link CanoePacket} and {@link CanoeStream} directly.
 *
 * @author sulin
 * @since 2019-10-28 15:13:24
 */
public final class Canoe {

    public Input  input;
    public Output output;

    private volatile boolean closed;

    /**
     * Initialize Canoe instance, supports packet-mode and stream-mode
     *
     * @param enableStreamMode Enable stream-mode or not
     */
    public Canoe(boolean enableStreamMode) {
        this.input = new Input(enableStreamMode);
        this.output = new Output(enableStreamMode);
    }

    /**
     * Read the next object and convert it into the specified type.
     *
     * @param tRef The specified type, support generic type
     * @param <T>  Generic Type
     * @return Read result
     * @throws IOException if an I/O error occurs.
     */
    public <T> T read(byte[] data, TypeRef<T> tRef) throws IOException {
        if (closed) {
            throw new CanoeClosedException("Canoe is closed");
        }
        Object obj = input.read(data);
        return CodecUtils.convert(obj, tRef);
    }

    /**
     * Read the next object and convert it into the specified class.
     *
     * @param tCls The specified class
     * @return Read result
     * @throws IOException if an I/O error occurs.
     */
    public <T> T read(byte[] data, Class<T> tCls) throws IOException {
        if (closed) {
            throw new CanoeClosedException("Canoe is closed");
        }
        Object obj = input.read(data);
        return CodecUtils.convert(obj, tCls);
    }

    /**
     * Write the specified object into
     *
     * @param obj The specified object
     * @throws IOException if an I/O error occurs.
     */
    public byte[] write(Object obj) throws IOException {
        if (closed) {
            throw new CanoeClosedException("Canoe is closed");
        }
        return output.write(obj);
    }

    /**
     * Close this canoe instance, and release all resources
     */
    public void close() {
        if (this.closed) {
            return;
        }
        this.input = null;
        this.output = null;
        this.closed = true;
    }

}