package com.mahamitra.implementations;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.mahamitra.implementations.Sorts.MergeSort;
import com.mahamitra.implementations.Sorts.MergeSortThreadOptimize;
import com.mahamitra.implementations.Utils.AbstractIntegerSortTest;
import com.mahamitra.implementations.Utils.IntegerSortTest;

import org.junit.jupiter.api.Test;

public class MergeSortTest extends AbstractIntegerSortTest implements IntegerSortTest {

    @Override
    @Test
    public void testRun() {
        MergeSort mergeSort = new MergeSort();
        assertArrayEquals(sortedArray, mergeSort.run(unSortedArray));
    }

    @Test
    public void testRunThread() {
        MergeSortThreadOptimize mergeSort = new MergeSortThreadOptimize();
        assertArrayEquals(sortedArray, mergeSort.run(unSortedArray));
    }

}
