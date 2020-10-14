package com.mahamitra.implementations;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.mahamitra.implementations.Sorts.HeapSort;
import com.mahamitra.implementations.Utils.AbstractIntegerSortTest;
import com.mahamitra.implementations.Utils.IntegerSortTest;

import org.junit.jupiter.api.Test;

public class HeapSortTest extends AbstractIntegerSortTest implements IntegerSortTest {

    @Override
    @Test
    public void testRun() {
        HeapSort heapSort = new HeapSort();
        heapSort.run(unSortedArray);
        assertArrayEquals(sortedArray, unSortedArray);
    }

}
