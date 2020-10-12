package com.mahamitra.implementations.Utils;

import java.util.Arrays;
import java.util.List;

import com.mahamitra.implementations.DataStructures.Trees.SimpleBinaryTree.BinaryNode;

import org.junit.jupiter.api.BeforeEach;

public abstract class AbstractSimpleBinaryTreeTest {
    protected final BinaryNode root = new BinaryNode(50);
    protected List<Integer> intArrayRepresentation = Arrays.asList(50, 25, 30, 20, 19, 25, 15);
    protected List<BinaryNode> nodeArrayRepresentation;

    @BeforeEach
    public void before() {
        root.setChild1(new BinaryNode(25));
        root.setChild2(new BinaryNode(30));
        root.getChild1().setChild1(new BinaryNode(20));
        root.getChild1().setChild2(new BinaryNode(19));
        root.getChild2().setChild1(new BinaryNode(25));
        root.getChild2().setChild2(new BinaryNode(15));

        nodeArrayRepresentation = Arrays.asList(
            root,
            root.getChild1(),
            root.getChild2(),
            root.getChild1().getChild1(),
            root.getChild1().getChild2(),
            root.getChild2().getChild1(),
            root.getChild2().getChild2()
        );
    }
}
