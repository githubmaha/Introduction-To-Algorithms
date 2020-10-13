package com.mahamitra.implementations.DataStructures.Heaps;

import java.util.List;

import com.mahamitra.implementations.DataStructures.Trees.SimpleBinaryTree.BinaryTreeNode;
import com.mahamitra.implementations.DataStructures.Trees.SimpleBinaryTree.SimpleBinaryTree;

public class MaxHeap extends SimpleBinaryTree implements Heap {

    public MaxHeap(BinaryTreeNode root) {
        super(root);
    }

    @Override
    public BinaryTreeNode add(int data){
        BinaryTreeNode newNode = new BinaryTreeNode(data);
        if (root == null) {
            root = newNode;
            return root;
        }

        List<BinaryTreeNode> nodeArrayRepresentation = getArrayRepresentation(BinaryTreeNode.class);
        nodeArrayRepresentation.add(newNode);
        int newNodeIndex = nodeArrayRepresentation.size() - 1;
        int parentIndex = newNodeIndex / 2;

        while (nodeArrayRepresentation.get(parentIndex).getData() < nodeArrayRepresentation.get(newNodeIndex).getData()) {
            swapData(nodeArrayRepresentation.get(parentIndex), nodeArrayRepresentation.get(newNodeIndex));
            newNodeIndex = parentIndex;
            parentIndex = newNodeIndex / 2;
        }

        return nodeArrayRepresentation.get(0);
    }

    @Override
    public BinaryTreeNode delete(int index) {
        // TODO Auto-generated method stub
        return null;
    }
}
