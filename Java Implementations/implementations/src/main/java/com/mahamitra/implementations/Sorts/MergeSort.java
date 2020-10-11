package com.mahamitra.implementations.Sorts;

import java.util.Arrays;

import com.mahamitra.implementations.Utils.SortAlgorithmWithIntegerInput;

public class MergeSort implements SortAlgorithmWithIntegerInput {

    int[] merge(int[] arr1, int[] arr2) {
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
        if (input.length == 1) {
            return input;
        }

        int halfIndex;

        if (input.length % 2 == 0) {
            halfIndex = input.length / 2;
        } else {
            halfIndex = (input.length / 2) + 1;
        }

        return merge(run(Arrays.copyOfRange(input, 0, halfIndex)), run(Arrays.copyOfRange(input, halfIndex, input.length)));
    }

}
