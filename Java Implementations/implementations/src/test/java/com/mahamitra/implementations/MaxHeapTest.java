package com.mahamitra.implementations;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.mahamitra.implementations.DataStructures.Heaps.MaxHeap;
import com.mahamitra.implementations.Utils.AbstractHeapTest;
import com.mahamitra.implementations.Utils.ArrayUtils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MaxHeapTest extends AbstractHeapTest {
    List<Integer> maxHeapExpected;

    @BeforeEach
    public void before() {
        maxHeapExpected = new ArrayList<Integer>(Arrays.asList(50, 31, 25, 10, 12, 20, 19));
    }

    @Override
    @Test
    public void testRun() {
        MaxHeap maxHeap = new MaxHeap(50);
        assertEquals(50, maxHeap.get(0));
    }

    @Test
    public void testAdd() {
        MaxHeap maxHeap = new MaxHeap(50);
        maxHeap.add(31);
        maxHeap.add(25);
        maxHeap.add(10);
        maxHeap.add(12);
        maxHeap.add(20);
        maxHeap.add(19);

        assertEquals(true, maxHeapExpected.equals(maxHeap.heap));

        maxHeap.add(26);
        maxHeapExpected.set(3, 26);
        maxHeapExpected.add(10);

        assertEquals(true, maxHeapExpected.equals(maxHeap.heap));
    }

    @Test
    public void testAddMany() {
        MaxHeap maxHeap = new MaxHeap(50);
        maxHeap.add(31, 25, 10, 12, 20, 19);

        assertEquals(true, maxHeapExpected.equals(maxHeap.heap));

        maxHeap.add(26, 5);
        maxHeapExpected.set(3, 26);
        maxHeapExpected.add(10);
        maxHeapExpected.add(5);

        assertEquals(true, maxHeapExpected.equals(maxHeap.heap));
    }
}
