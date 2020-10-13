package com.mahamitra.implementations;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.mahamitra.implementations.Sorts.QuickSort;
import com.mahamitra.implementations.Utils.AbstractIntegerSortTest;
import com.mahamitra.implementations.Utils.IntegerSortTest;

import org.junit.jupiter.api.Test;

public class QuickSortTest extends AbstractIntegerSortTest implements IntegerSortTest {

    @Override
    @Test
    public void testRun() {
        // TODO: Need to see why it fails on sorted array
        QuickSort quickSort = new QuickSort("frontBack");
        assertArrayEquals(sortedArray, quickSort.run(unSortedArray));
    }

    @Test
    public void testRunNotIntroToAlgoBook() {
        QuickSort quickSort = new QuickSort("introToAlgoBook");
        assertArrayEquals(sortedArray, quickSort.run(unSortedArray));
    }
}
