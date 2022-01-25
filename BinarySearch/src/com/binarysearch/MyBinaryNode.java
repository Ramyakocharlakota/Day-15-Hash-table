package com.binarysearch;

public class MyBinaryNode<K> {
	INode root;

	public void add(K key) {
		INode newNode = new INode(key);

		if (root == null) {
			root = newNode;
			return;
		} else {
			INode current = root, parent = null;

			while (true) {
				parent = current;

				int compareResult = ((String) key).compareTo((String) current.key);
				if (compareResult < 0) {
					current = current.left;
					if (current == null) {
						parent.left = newNode;
						return;
					}
				} else {
					current = current.right;
					if (current == null) {
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}

	public void addRecursively(INode node) {
		if(root == null) {
			System.out.println("Tree is empty");
			return;
		}else {
			if(node.left!=null)
				addRecursively(node.left);
			System.out.print(node.key+" ");
			if(node.right!=null)
				addRecursively(node.right);
		}
	}

	public static void main(String[] args) {
		MyBinaryNode<Integer> binaryTree = new MyBinaryNode<Integer>();
		System.out.println("Welcome to binary search tree !");
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		System.out.println("After adding node : ");
		binaryTree.addRecursively(binaryTree.root);
	}
}
