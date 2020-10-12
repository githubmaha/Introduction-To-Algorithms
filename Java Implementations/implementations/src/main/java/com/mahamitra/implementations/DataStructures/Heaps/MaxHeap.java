package com.mahamitra.implementations.DataStructures.Heaps;

import java.util.List;

import com.mahamitra.implementations.DataStructures.Trees.SimpleBinaryTree.BinaryNode;
import com.mahamitra.implementations.DataStructures.Trees.SimpleBinaryTree.SimpleBinaryTree;

public class MaxHeap extends SimpleBinaryTree implements Heap {

    public MaxHeap(BinaryNode root) {
        super(root);
    }

    @Override
    public BinaryNode add(int data){
        BinaryNode newNode = new BinaryNode(data);
        if (root == null) {
            root = newNode;
            return root;
        }

        List<BinaryNode> nodeArrayRepresentation = getArrayRepresentation(BinaryNode.class);
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
}
