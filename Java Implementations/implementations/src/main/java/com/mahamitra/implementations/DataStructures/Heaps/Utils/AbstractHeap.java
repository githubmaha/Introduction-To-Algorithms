package com.mahamitra.implementations.DataStructures.Heaps.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class AbstractHeap {
    public List<Integer> heap;

    protected AbstractHeap(int rootData) {
        heap = new ArrayList<Integer>(Arrays.asList(rootData));
    }

    protected AbstractHeap(int[] input) {
        heap = new ArrayList<Integer>(heapify(input));
    }

    abstract protected List<Integer> heapify(int... input);
    abstract public List<Integer> add(int data);
    abstract public List<Integer> delete(int indexToDelete);

    public List<Integer> add(int... data) {
        for (int d : data) {
            add(d);
        }

        return heap;
    }

    public List<Integer> delete(int... data) {
        for (int d : data) {
            delete(d);
        }

        return heap;
    }

    /**
     * Assume the heap array is not zero-indexed, then we have the formula:
     *
     * parentIndex = childIndex / 2
     *
     * Since the array is zero-indexed, we would need to convert it to:
     *
     * parentIndex = (childIndex + 1) / 2
     *
     * But this gives us the parent index if the heap was not zero-indexed
     * So to convert it back we subtract by 1, and by reducing that formula
     * we get the final formula below
     */
    protected int getParentIndex(int childIndex) {
        return (childIndex - 1) / 2;
    }

    protected int getLeftChildIndex(int parentIndex) {
        return 2 * parentIndex + 1;
    }

    protected int getRightChildIndex(int parentIndex) {
        return 2 * parentIndex + 2;
    }

    public int get(int index) {
        return heap.get(index);
    }
}
