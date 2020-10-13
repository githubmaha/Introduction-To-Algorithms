package com.mahamitra.implementations.DataStructures.Trees.SimpleBinaryTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.mahamitra.implementations.DataStructures.Trees.Utils.AbstractBinaryTree;

public class SimpleBinaryTree extends AbstractBinaryTree {
    private interface ArrayRepresentationAlgorithm {
        <T> void getRepresentation(List<BinaryTreeNode> nodes, List<T> arrayRepresentation);
    }

    public SimpleBinaryTree(BinaryTreeNode root) {
        this.root = root;
    }


    private <T> void getNodeArrayRepresentation(List<BinaryTreeNode> nodes, List<T> arrayRepresentation) {
        if (nodes.size() == 0) {
            return;
        }

        List<BinaryTreeNode> childNodes = new ArrayList<BinaryTreeNode>();

        for (BinaryTreeNode node : nodes) {
            arrayRepresentation.add((T)node);

            if (node.getChild1() != null) {
                childNodes.add(node.getChild1());
            }

            if (node.getChild2() != null) {
                childNodes.add(node.getChild2());
            }
        }

        getNodeArrayRepresentation(childNodes, arrayRepresentation);
    }


    private <T> void getDataArrayRepresentation(List<BinaryTreeNode> nodes, List<T> arrayRepresentation) {
        if (nodes.size() == 0) {
            return;
        }

        List<BinaryTreeNode> childNodes = new ArrayList<BinaryTreeNode>();

        for (BinaryTreeNode node : nodes) {
            arrayRepresentation.add((T)node.getData());

            if (node.getChild1() != null) {
                childNodes.add(node.getChild1());
            }

            if (node.getChild2() != null) {
                childNodes.add(node.getChild2());
            }
        }

        getDataArrayRepresentation(childNodes, arrayRepresentation);
    }

    @Override
    public <T> List<T> getArrayRepresentation(Class<T> type){
        ArrayRepresentationAlgorithm arrayRepresentationAlgorithm;

        if (type.equals(BinaryTreeNode.class)) {
            arrayRepresentationAlgorithm = this::getNodeArrayRepresentation;
        } else {
            arrayRepresentationAlgorithm = this::getDataArrayRepresentation;
        }

        List<T> arrayRepresentation = new ArrayList<T>();
        arrayRepresentationAlgorithm.getRepresentation(Arrays.asList(root), arrayRepresentation);
        return arrayRepresentation;
    }
}
