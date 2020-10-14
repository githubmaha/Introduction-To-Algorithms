package com.mahamitra.implementations;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.mahamitra.implementations.Sorts.InsertionSort;
import com.mahamitra.implementations.Utils.AbstractIntegerSortTest;
import com.mahamitra.implementations.Utils.IntegerSortTest;

import org.junit.jupiter.api.Test;

public class InsertionSortTest extends AbstractIntegerSortTest implements IntegerSortTest {

   @Override
   @Test
    public void testRun() {
        InsertionSort inspectionSort = new InsertionSort();
        inspectionSort.run(unSortedArray);
        assertArrayEquals(sortedArray, unSortedArray);
    }
}
