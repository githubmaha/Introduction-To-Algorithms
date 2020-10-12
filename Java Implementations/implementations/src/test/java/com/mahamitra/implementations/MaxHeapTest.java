package com.mahamitra.implementations;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.mahamitra.implementations.DataStructures.Heaps.MaxHeap;
import com.mahamitra.implementations.Utils.AbstractSimpleBinaryTreeTest;
import com.mahamitra.implementations.Utils.BinaryTreeTest;

import org.junit.jupiter.api.Test;

public class MaxHeapTest extends AbstractSimpleBinaryTreeTest implements BinaryTreeTest {

    @Override
    @Test
    public void testRun() {
        MaxHeap maxHeap = new MaxHeap(root);
        assertEquals(root, maxHeap.getRoot());
    }

    @Test
    public void testAdd() {
        MaxHeap maxHeap = new MaxHeap(root);
        maxHeap.add(31);

        assertEquals(50, root.getData());
        assertEquals(31, root.getChild1().getData());
    }
}
