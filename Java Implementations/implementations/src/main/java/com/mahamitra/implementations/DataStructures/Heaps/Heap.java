package com.mahamitra.implementations.DataStructures.Heaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Heap {
    public List<Integer> heap;

    protected Heap(int rootData) {
        heap = new ArrayList<Integer>(Arrays.asList(rootData));
    }

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
