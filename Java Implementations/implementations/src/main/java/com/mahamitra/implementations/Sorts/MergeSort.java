package com.mahamitra.implementations.Sorts;

import java.util.Arrays;

import com.mahamitra.implementations.Utils.SortAlgorithmWithIntegerInput;

/**
 * Works by dividing the array by 2 until you are left with arrays the size of 1.
 * Then it takes the smaller arrays and merges them by sorting them into 1 array
 *
 * Time: O(n log n)
 * Space: O(n log n) for thread based and O(3n) for non-thread based
 */
public class MergeSort implements SortAlgorithmWithIntegerInput {

    protected void merge(int[] input, int start, int end) {
        int middle = (end + start) / 2;
        int[] half1 = Arrays.copyOfRange(input, start, middle + 1);
        int[] half2 = Arrays.copyOfRange(input, middle + 1, end + 1);

        int index1 = 0;
        int index2 = 0;

        for(int i = start; i <= end; ++i) {
            if (index2 >= half2.length || (index1 < half1.length && half1[index1] < half2[index2])) {
                input[i] = half1[index1++];
            } else {
                input[i] = half2[index2++];
            }
        }
    }

    protected void run(int[] input, int start, int end) {
        if (end == start) {
            return;
        }

        int middle = (start + end) / 2;

        run(input, start, middle);
        run(input, middle + 1, end);
        merge(input, start, end);
    }

    @Override
    public void run(int[] input) {
        run(input, 0, input.length - 1);
    }

}
