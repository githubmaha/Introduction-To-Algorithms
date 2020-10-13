package com.mahamitra.implementations.DataStructures.Heaps;

import java.util.List;

import com.mahamitra.implementations.Utils.ArrayUtils;

public class MaxHeap extends Heap {

    public MaxHeap(int rootData) {
        super(rootData);
    }

    private void bubbleUp(int currentIndex) {
        int parentIndex = getParentIndex(currentIndex);
        while (parentIndex >= 0 && heap.get(parentIndex) < heap.get(currentIndex)) {
            ArrayUtils.swap(heap, parentIndex, currentIndex);
            currentIndex = parentIndex;
            parentIndex = getParentIndex(parentIndex);
        }
    }

    private void bubbleDown(int currentIndex) {
        int leftChildIndex = getLeftChildIndex(currentIndex);

        if (leftChildIndex >= heap.size()) {
            return;
        }

        int rightChildIndex = getRightChildIndex(currentIndex) < heap.size() ? getRightChildIndex(currentIndex) : leftChildIndex;

        int largerIndex = heap.get(leftChildIndex) > heap.get(rightChildIndex) ? leftChildIndex : rightChildIndex;

        while (heap.get(currentIndex) < heap.get(largerIndex)) {
            ArrayUtils.swap(heap, currentIndex, largerIndex);
            currentIndex = largerIndex;
            leftChildIndex = getLeftChildIndex(currentIndex);

            if (leftChildIndex >= heap.size()) {
                break;
            }

            rightChildIndex = getRightChildIndex(currentIndex) < heap.size() ? getRightChildIndex(currentIndex) : leftChildIndex;
            largerIndex = heap.get(leftChildIndex) > heap.get(rightChildIndex) ? leftChildIndex : rightChildIndex;
        }
    }

    @Override
    public List<Integer> add(int data){
        if (heap.size() == 0) {
            heap.add(data);
            return heap;
        }

        heap.add(data);
        int newNodeIndex = heap.size() - 1;

        bubbleUp(newNodeIndex);

        return heap;
    }

    @Override
    public List<Integer> delete(int indexToDelete) {
        if (indexToDelete == heap.size() - 1) {
            heap.remove(heap.size() - 1);
            return heap;
        }

        ArrayUtils.swap(heap, indexToDelete, heap.size() - 1);
        heap.remove(heap.size() - 1);

        if (heap.get(indexToDelete) > heap.get(getParentIndex(indexToDelete))) {
            bubbleUp(indexToDelete);
        } else {
            bubbleDown(indexToDelete);
        }

        return heap;
    }
}
