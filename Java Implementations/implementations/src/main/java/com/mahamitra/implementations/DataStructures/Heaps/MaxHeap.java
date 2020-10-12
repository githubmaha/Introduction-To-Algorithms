package com.mahamitra.implementations.DataStructures.Heaps;

import com.mahamitra.implementations.DataStructures.Trees.SimpleBinaryTree.BinaryNode;
import com.mahamitra.implementations.DataStructures.Trees.SimpleBinaryTree.SimpleBinaryTree;

public class MaxHeap extends SimpleBinaryTree implements Heap {

    public MaxHeap(BinaryNode root) {
        super(root);
    }

    @Override
    public BinaryNode add(int data) {
        if (root == null) {
            root = new BinaryNode(data);
            return root;
        }

        return root;
    }
}
