package com.github.sisyphsu.nakedata.node.container.slice;

import com.github.sisyphsu.nakedata.context.model.ContextType;
import com.github.sisyphsu.nakedata.node.container.SliceNode;
import com.github.sisyphsu.nakedata.type.DataType;

/**
 * byte[] slice
 *
 * @author sulin
 * @since 2019-05-08 21:01:31
 */
public class ByteSliceNode extends SliceNode {

    private byte[] items;

    public ByteSliceNode(byte[] items) {
        if (items == null) {
            throw new IllegalArgumentException("items can't be null");
        }
        this.items = items;
    }

    @Override
    public int size() {
        return items.length;
    }

    @Override
    public DataType dataType() {
        return DataType.BYTE;
    }

    @Override
    public ContextType contextType() {
        return null;
    }

}