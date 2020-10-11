package com.mahamitra.implementations;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.mahamitra.implementations.Sorts.MergeSort;
import com.mahamitra.implementations.Sorts.MergeSortThreadOptimize;

import org.junit.jupiter.api.Test;

public class MergeSortTest implements IntegerSortTest {

    @Override
    @Test
    public void testRun() {
        MergeSort mergeSort = new MergeSort();
        assertArrayEquals(sortedArray, mergeSort.run(new int[] {5, 2, 4, 6, 1, 3}));
    }

    @Test
    public void testRunThread() {
        MergeSortThreadOptimize mergeSort = new MergeSortThreadOptimize();
        assertArrayEquals(sortedArray, mergeSort.run(new int[] {5, 2, 4, 6, 1, 3}));
    }

}
