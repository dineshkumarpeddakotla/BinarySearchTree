package com.binarysearchtree;

public interface INode<K> {
    K getKey();
    void setKey(K key);

    INode<K> getRight();
    void setRight(INode<K> right);

    INode<K> getLeft();
    void setLeft(INode<K> left);
}
