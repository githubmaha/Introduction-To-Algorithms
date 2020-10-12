package com.mahamitra.implementations;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import com.mahamitra.implementations.DataStructures.Trees.SimpleBinaryTree.BinaryNode;
import com.mahamitra.implementations.DataStructures.Trees.SimpleBinaryTree.SimpleBinaryTree;
import com.mahamitra.implementations.Utils.BinaryTreeTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SimpleBinaryTreeTest implements BinaryTreeTest {
    List<Integer> arrayRepresentation = Arrays.asList(50, 25, 30, 20, 19, 25, 15);

    @BeforeEach
    public void before() {
        root.setChild1(new BinaryNode(25));
        root.setChild2(new BinaryNode(30));
        root.getChild1().setChild1(new BinaryNode(20));
        root.getChild1().setChild2(new BinaryNode(19));
        root.getChild2().setChild1(new BinaryNode(25));
        root.getChild2().setChild2(new BinaryNode(15));
    }

    @Test
    public void testRun() {
        SimpleBinaryTree simpleBinaryTree = new SimpleBinaryTree(root);
        List<Integer> representation = simpleBinaryTree.getArrayRepresentation();
        assertEquals(true, arrayRepresentation.equals(representation));
    }
}
