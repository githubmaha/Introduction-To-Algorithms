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

    protected int[] merge(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];

        int index1 = 0;
        int index2 = 0;

        for(int i = 0; i < merged.length; ++i) {
            if (index2 >= arr2.length || (index1 < arr1.length && arr1[index1] < arr2[index2])) {
                merged[i] = arr1[index1++];
            } else {
                merged[i] = arr2[index2++];
            }
        }

        return merged;
    }

    @Override
    public int[] run(int[] input) {
        if (input.length <= 1) {
            return input;
        }

        return merge(run(Arrays.copyOfRange(input, 0, input.length / 2)), run(Arrays.copyOfRange(input, input.length / 2, input.length)));
    }

}
