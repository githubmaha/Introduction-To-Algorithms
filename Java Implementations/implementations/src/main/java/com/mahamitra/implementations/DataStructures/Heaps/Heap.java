package com.mahamitra.implementations.DataStructures.Heaps;

import java.security.InvalidAlgorithmParameterException;

import com.mahamitra.implementations.DataStructures.Trees.SimpleBinaryTree.BinaryNode;

public interface Heap {
    BinaryNode add(int data) throws InvalidAlgorithmParameterException;
}
