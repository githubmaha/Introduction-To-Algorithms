package com.mahamitra.implementations.DataStructures.Trees.Utils;

import java.util.List;

import com.mahamitra.implementations.DataStructures.Trees.SimpleBinaryTree.BinaryNode;


public abstract class AbstractBinaryTree {
    protected BinaryNode root;

    abstract public List<Integer> getArrayRepresentation();
}
