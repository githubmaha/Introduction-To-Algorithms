package com.mahamitra.implementations;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.mahamitra.implementations.Sorts.QuickSort;

import org.junit.jupiter.api.Test;

public class QuickSortTest implements IntegerSortTest {

    @Override
    @Test
    public void testRun() {
        QuickSort quickSort = new QuickSort("frontBack");
        assertArrayEquals(sortedArray, quickSort.run(new int[] {5, 2, 4, 6, 1, 3}));
    }

    @Test
    public void testRunNotIntroToAlgoBook() {
        QuickSort quickSort = new QuickSort("introToAlgoBook");
        assertArrayEquals(sortedArray, quickSort.run(new int[] {5, 2, 4, 6, 1, 3}));
    }
}
