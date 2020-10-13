package com.mahamitra.implementations.DataStructures.Heaps;

import com.mahamitra.implementations.DataStructures.Trees.SimpleBinaryTree.BinaryTreeNode;

public interface Heap {
    BinaryTreeNode add(int data);
    BinaryTreeNode delete(int index);
}
