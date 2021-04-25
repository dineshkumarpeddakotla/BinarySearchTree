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
        System.out.println("Size = "+size);
        Assertions.assertEquals(3, size);
    }

    @Test
    public void givenNNumbersWhenAddedToTreeShouldReturnSizeN(){
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();

        binarySearchTree.add(56);
        binarySearchTree.add(30);
        binarySearchTree.add(70);
        binarySearchTree.add(22);
        binarySearchTree.add(40);
        binarySearchTree.add(60);
        binarySearchTree.add(95);
        binarySearchTree.add(11);
        binarySearchTree.add(65);
        binarySearchTree.add(3);
        binarySearchTree.add(16);
        binarySearchTree.add(63);
        binarySearchTree.add(67);

        int size = binarySearchTree.getSize();
        System.out.println("Size = "+size);
        Assertions.assertEquals(13,size);
    }
}
