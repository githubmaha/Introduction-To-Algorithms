package com.mahamitra.implementations.DataStructures.Trees.SimpleBinaryTree;

import com.mahamitra.implementations.DataStructures.Trees.Utils.GenericNode;

public class BinaryNode extends GenericNode<Integer> {
    BinaryNode child1;
    BinaryNode child2;

    public BinaryNode(int data) {
        this.data = data;
        child1 = null;
        child2 = null;
    }
}
