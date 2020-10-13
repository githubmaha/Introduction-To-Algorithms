package com.mahamitra.implementations.DataStructures.Trees.Utils;

import java.security.InvalidAlgorithmParameterException;
import java.util.List;

import com.mahamitra.implementations.DataStructures.Trees.SimpleBinaryTree.BinaryTreeNode;

import lombok.Getter;

@Getter
public abstract class AbstractBinaryTree {
    protected BinaryTreeNode root;

    abstract public <T> List<T> getArrayRepresentation(Class<T> type) throws InvalidAlgorithmParameterException;

    public void swapData(BinaryTreeNode node1, BinaryTreeNode node2) {
        int temp = node1.getData();
        node1.setData(node2.getData());
        node2.setData(temp);
    }
}
