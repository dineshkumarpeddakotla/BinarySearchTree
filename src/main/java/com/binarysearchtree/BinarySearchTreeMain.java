package com.binarysearchtree;

public class BinarySearchTreeMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Binary Search Tree");
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

        System.out.println("Seared Key = " +binarySearchTree.searchNode(63).getKey());
    }
}
