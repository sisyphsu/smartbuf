package com.github.sisyphsu.smartbuf.node.array;

import com.github.sisyphsu.smartbuf.Const;
import com.github.sisyphsu.smartbuf.node.Node;

/**
 * @author sulin
 * @since 2019-11-03 14:47:29
 */
public final class DoubleArrayNode extends Node {

    private final double[] data;

    public DoubleArrayNode(double[] data) {
        this.data = data;
    }

    @Override
    public Object value() {
        return data;
    }

    @Override
    public byte type() {
        return Const.TYPE_NARRAY_DOUBLE;
    }
}