package com.mahamitra.implementations.DataStructures.Trees.SimpleBinaryTree;

import com.mahamitra.implementations.DataStructures.Trees.Utils.GenericTreeNode;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BinaryTreeNode extends GenericTreeNode<Integer> {
    BinaryTreeNode child1;
    BinaryTreeNode child2;

    public BinaryTreeNode(int data) {
        this.data = data;
        child1 = null;
        child2 = null;
    }
}
