package com.mahamitra.implementations.DataStructures.Heaps;

import java.util.List;

import com.mahamitra.implementations.Utils.ArrayUtils;

public class MaxHeap extends Heap {

    public MaxHeap(int rootData) {
        super(rootData);
    }

    @Override
    public List<Integer> add(int data){
        if (heap.size() == 0) {
            heap.add(data);
            return heap;
        }

        heap.add(data);
        int newNodeIndex = heap.size() - 1;
        int parentIndex = getParentIndex(newNodeIndex);

        while (parentIndex >= 0 && heap.get(parentIndex) < heap.get(newNodeIndex)) {
            ArrayUtils.swap(heap, parentIndex, newNodeIndex);
            newNodeIndex = parentIndex;
            parentIndex = getParentIndex(parentIndex);
        }

        return heap;
    }

    @Override
    public List<Integer> delete(int indexToDelete) {
        ArrayUtils.swap(heap, indexToDelete, heap.size() - 1);

        return heap;
    }
}
