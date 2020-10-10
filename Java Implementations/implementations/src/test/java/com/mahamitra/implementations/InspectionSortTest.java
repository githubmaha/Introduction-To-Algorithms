package com.mahamitra.implementations;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.mahamitra.implementations.InspectionSort.InspectionSort;

import org.junit.jupiter.api.Test;

public class InspectionSortTest implements IntegerSortTest {
   @Test
    public void testRun() {
        InspectionSort inspectionSort = new InspectionSort();
        assertArrayEquals(sortedArray, inspectionSort.run(new int[] {5, 2, 4, 6, 1, 3}));
    }
}
