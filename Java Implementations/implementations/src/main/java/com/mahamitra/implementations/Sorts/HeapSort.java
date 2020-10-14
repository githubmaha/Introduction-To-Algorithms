package com.mahamitra.implementations.Sorts;

import com.mahamitra.implementations.DataStructures.Heaps.MaxHeap;
import com.mahamitra.implementations.Utils.SortAlgorithmWithIntegerInput;

public class HeapSort implements SortAlgorithmWithIntegerInput {

    @Override
    public void run(int[] input) {
        MaxHeap maxHeap = new MaxHeap(input);

        for (int i = input.length - 1; i >= 0; --i) {
            input[i] = maxHeap.get(0);
            maxHeap.delete(0);
        }
    }

}
