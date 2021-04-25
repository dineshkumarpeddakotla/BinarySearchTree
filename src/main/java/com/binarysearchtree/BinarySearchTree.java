package com.binarysearchtree;

public class BinarySearchTree<K extends Comparable<K>> {
    private BinaryNode<K> root;

    public void add(K key) {
        this.root = (BinaryNode<K>) this.addRecursively(root, key);
    }

    private INode<K> addRecursively(INode<K> current, K key) {
        if (current == null) {
            return new BinaryNode<>(key);
        }
        int compareResult = key.compareTo(current.getKey());
        if (compareResult == 0) {
            return current;
        }
        if (compareResult < 0) {
            current.setLeft(addRecursively(current.getLeft(), key));
        } else {
            current.setRight(addRecursively(current.getRight(), key));
        }
        return current;
    }

    public int getSize() {
        return this.getSizeRecursive(root);
    }

    private int getSizeRecursive(INode<K> current) {
        return current == null ? 0 : 1 + this.getSizeRecursive(current.getLeft())
                + this.getSizeRecursive(current.getRight());
    }

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                '}';
    }
}
