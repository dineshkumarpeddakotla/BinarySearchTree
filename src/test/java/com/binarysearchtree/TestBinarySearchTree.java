package com.binarysearchtree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBinarySearchTree {

    @Test
    public void given3NumbersWhenAddedToBinaryTreeShouldReturnSizeThree() {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();

        binarySearchTree.add(56);
        binarySearchTree.add(30);
        binarySearchTree.add(70);
        int size = binarySearchTree.getSize();

        Assertions.assertEquals(3, size);
    }
}
