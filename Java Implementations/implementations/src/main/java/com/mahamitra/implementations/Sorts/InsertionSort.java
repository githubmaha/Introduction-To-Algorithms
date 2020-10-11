package com.mahamitra.implementations.Sorts;

import com.mahamitra.implementations.Utils.SortAlgorithmWithIntegerInput;

public class InsertionSort implements SortAlgorithmWithIntegerInput {

    /**
     * Works by taking the number at the current index and swapping that
     * with the numbers before it until the original number is sorted
     *
     * Time: O(n^2)
     * Space: O(n)
     */
    @Override
    public int[] run(int[] input) {
        for (int i = 0; i < input.length; ++i) {
            int key = input[i];

            for (int j = i - 1; j >= 0; --j) {
                if (input[j] > key) {
                    input[j + 1] = input[j];
                    input[j] = key;
                } else {
                    break;
                }
            }
        }

        return input;
    }
}
