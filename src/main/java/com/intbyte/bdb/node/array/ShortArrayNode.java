package com.intbyte.bdb.node.array;

import com.intbyte.bdb.node.ShortNode;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;


public class ShortArrayNode extends ArrayNode {
    private short[] array;

    public ShortArrayNode(short[] array, int pointer) {
        super(ArrayNode.ID + ShortNode.ID, pointer);
        this.array = array;
    }

    @Override
    protected void convertToByteArray(ByteBuffer buffer) {
        buffer.asShortBuffer().put(array);
    }

    @Override
    protected int arraySize() {
        return array.length*2;
    }
}