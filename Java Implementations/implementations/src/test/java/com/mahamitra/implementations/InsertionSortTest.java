package com.mahamitra.implementations;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.mahamitra.implementations.InspectionSort.InsertionSort;

import org.junit.jupiter.api.Test;

public class InsertionSortTest implements IntegerSortTest {
   @Test
    public void testRun() {
        InsertionSort inspectionSort = new InsertionSort();
        assertArrayEquals(sortedArray, inspectionSort.run(new int[] {5, 2, 4, 6, 1, 3}));
    }
}