package com.mahamitra.implementations.DataStructures.Trees.SimpleBinaryTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.mahamitra.implementations.DataStructures.Trees.Utils.AbstractBinaryTree;

public class SimpleBinaryTree extends AbstractBinaryTree {
    public SimpleBinaryTree(BinaryNode root) {
        this.root = root;
    }

    private void getArrayRepresentation(List<BinaryNode> nodes, List<Integer> arrayRepresentation) {
        if (nodes.size() == 0) {
            return;
        }

        List<BinaryNode> childNodes = new ArrayList<BinaryNode>();

        for (BinaryNode node : nodes) {
            arrayRepresentation.add(node.getData());

            if (node.getChild1() != null) {
                childNodes.add(node.getChild1());
            }

            if (node.getChild2() != null) {
                childNodes.add(node.getChild2());
            }
        }

        getArrayRepresentation(childNodes, arrayRepresentation);
    }

    @Override
    public List<Integer> getArrayRepresentation() {
        List<Integer> arrayRepresentation = new ArrayList<Integer>();
        getArrayRepresentation(Arrays.asList(root), arrayRepresentation);
        return arrayRepresentation;
    }
}
