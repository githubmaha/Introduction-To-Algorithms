package com.mahamitra.implementations.Sorts;

import com.mahamitra.implementations.Utils.ArrayUtils;
import com.mahamitra.implementations.Utils.SortAlgorithmWithIntegerInput;

/**
 * Works by taking the number at the current index and swapping that
 * with the numbers before it until the original number is sorted
 *
 * Time: O(n^2)
 * Space: O(n)
 */
public class InsertionSort implements SortAlgorithmWithIntegerInput {

    @Override
    public int[] run(int[] input) {
        for (int i = 0; i < input.length; ++i) {
            int key = input[i];

            int j = i - 1;

            while (j >= 0 && input[j] > key) {
                ArrayUtils.swap(input, j + 1, j--);
            }
        }

        return input;
    }
}
