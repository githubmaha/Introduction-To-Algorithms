package com.mahamitra.implementations;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import com.mahamitra.implementations.DataStructures.Trees.SimpleBinaryTree.BinaryNode;
import com.mahamitra.implementations.DataStructures.Trees.SimpleBinaryTree.SimpleBinaryTree;
import com.mahamitra.implementations.Utils.AbstractSimpleBinaryTreeTest;
import com.mahamitra.implementations.Utils.BinaryTreeTest;

import org.junit.jupiter.api.Test;

public class SimpleBinaryTreeTest extends AbstractSimpleBinaryTreeTest implements BinaryTreeTest {

    @Override
    @Test
    public void testRun() {
        SimpleBinaryTree simpleBinaryTree = new SimpleBinaryTree(root);
        assertEquals(root, simpleBinaryTree.getRoot());
    }

    @Test
    public void testRunIntArray() {
        SimpleBinaryTree simpleBinaryTree = new SimpleBinaryTree(root);
        List<Integer> representation = simpleBinaryTree.getArrayRepresentation(Integer.class);
        assertEquals(true, intArrayRepresentation.equals(representation));
    }

    @Test
    public void testRunNodeArray() {
        SimpleBinaryTree simpleBinaryTree = new SimpleBinaryTree(root);
        List<BinaryNode> representation = simpleBinaryTree.getArrayRepresentation(BinaryNode.class);
        assertEquals(true, nodeArrayRepresentation.equals(representation));
    }
}
