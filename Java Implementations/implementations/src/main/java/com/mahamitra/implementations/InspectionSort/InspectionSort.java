package com.mahamitra.implementations.InspectionSort;

import com.mahamitra.implementations.Utils.SortAlgorithmInteger;

public class InspectionSort implements SortAlgorithmInteger {

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
