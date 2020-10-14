package com.mahamitra.implementations.Sorts;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MergeSortThreadOptimize extends MergeSort {

    @Override
    protected void run(int[] input, int start, int end) {
        ExecutorService pool = Executors.newFixedThreadPool(6);

        if (end == start) {
            return;
        }

        int middle = (start + end) / 2;

        pool.submit(() -> run(input, start, middle));
        pool.submit(() -> run(input, middle + 1, end));

        pool.shutdown();
        try {
            pool.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        merge(input, start, end);
    }
}
