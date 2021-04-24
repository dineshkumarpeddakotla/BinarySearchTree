package com.binarysearchtree;

public class BinaryNode<K extends Comparable<K>> implements INode<K> {
    private K key;
    private INode<K> left;
    private INode<K> right;

    BinaryNode(K key){
        this.key = key;
        this.left = null;
        this.right = null;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K key) {
        this.key = key;
    }

    @Override
    public INode<K> getRight() {
        return right;
    }

    @Override
    public void setRight(INode<K> right) {
        this.right = right;
    }

    @Override
    public INode<K> getLeft() {
        return left;
    }

    @Override
    public void setLeft(INode<K> left) {
        this.left = left;
    }
}
