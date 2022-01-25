package com.binarysearch;

public class INode<K> {
	K key;
	INode left;
	INode right;


	public INode(K key) {
		this.key = key;
		this.left = this.right = null;
	}
}

