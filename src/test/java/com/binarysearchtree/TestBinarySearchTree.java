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

    @Test
    public void whenGivenNumbersAreAddedToTreeShouldBeAbleToSearchNode(){
        BinarySearchTree<Integer> customBinaryTree = new BinarySearchTree<>();
        customBinaryTree.add(56);
        customBinaryTree.add(30);
        customBinaryTree.add(70);
        customBinaryTree.add(22);
        customBinaryTree.add(40);
        customBinaryTree.add(60);
        customBinaryTree.add(95);
        customBinaryTree.add(11);
        customBinaryTree.add(65);
        customBinaryTree.add(3);
        customBinaryTree.add(16);
        customBinaryTree.add(63);
        customBinaryTree.add(67);

        INode<Integer> result = customBinaryTree.searchNode(63);
        Assertions.assertEquals(63, result.getKey());
        System.out.println("Key = " +result.getKey());
    }
}
