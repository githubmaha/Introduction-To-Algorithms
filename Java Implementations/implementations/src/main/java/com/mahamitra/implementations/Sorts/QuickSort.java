package com.mahamitra.implementations.Sorts;

import com.mahamitra.implementations.Utils.ArrayUtils;
import com.mahamitra.implementations.Utils.SortAlgorithmWithIntegerInput;

public class QuickSort implements SortAlgorithmWithIntegerInput{
    @FunctionalInterface
    private interface PivotSortAlgorithm {
        int getPivot(int[] arr, int start, int end);
    }

    PivotSortAlgorithm pivotAlgorithm;

    public QuickSort(String pivotAlgorithmName) {
        if (pivotAlgorithmName.equals("frontBack")) {
            pivotAlgorithm = this::pivotSortFrontBack;
        } else {
            pivotAlgorithm = this::pivotSortIntroToAlgo;
        }
    }

    private int pivotSortIntroToAlgo(int[] arr, int start, int end) {
        int lowerBound = start;

        for(int upperBound = start; upperBound < end - 1; ++upperBound) {
            if (arr[upperBound] < arr[end - 1]) {
                ArrayUtils.swap(arr, lowerBound++, upperBound);
            }
        }

        ArrayUtils.swap(arr, lowerBound, end - 1);

        return lowerBound;
    }

    private int pivotSortFrontBack(int[] arr, int start, int end) {
        int lowerBound = start + 1;
        int upperBound = end - 1;

        while (lowerBound < upperBound) {
            if(arr[lowerBound] > arr[start] && arr[upperBound] < arr[start]) {
                ArrayUtils.swap(arr, lowerBound, upperBound);
            }

            while (lowerBound < end && arr[lowerBound] < arr[start]) {
                ++lowerBound;
            }

            while (upperBound > start && arr[upperBound] > arr[start]) {
                --upperBound;
            }
        }

        ArrayUtils.swap(arr, start, upperBound);

        return upperBound;
    }

    private void run(int[] input, int start, int end) {
        if (start >= end) {
            return;
        }

        int pivot = pivotAlgorithm.getPivot(input, start, end);
        run(input, start, pivot);
        run(input, pivot + 1, end);
    }

    @Override
    public void run(int[] input) {
        run(input, 0, input.length);
    }

}
