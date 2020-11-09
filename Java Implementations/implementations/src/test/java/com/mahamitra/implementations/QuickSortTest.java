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
        QuickSort quickSort = new QuickSort("frontBack");
        quickSort.run(unSortedArray);
        assertArrayEquals(sortedArray, unSortedArray);
    }

    @Test
    public void testRunIntroToAlgoBook() {
        QuickSort quickSort = new QuickSort("introToAlgoBook");
        quickSort.run(unSortedArray);
        assertArrayEquals(sortedArray, unSortedArray);
    }
}
