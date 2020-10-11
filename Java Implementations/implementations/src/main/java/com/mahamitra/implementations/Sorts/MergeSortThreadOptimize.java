package com.mahamitra.implementations.Sorts;

import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MergeSortThreadOptimize extends MergeSort {
    ExecutorService pool = Executors.newFixedThreadPool(6);

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

        try {
            return pool.submit(() ->
            merge(run(Arrays.copyOfRange(input, 0, halfIndex)), run(Arrays.copyOfRange(input, halfIndex, input.length)))).get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
            return null;
        }
    }

}
