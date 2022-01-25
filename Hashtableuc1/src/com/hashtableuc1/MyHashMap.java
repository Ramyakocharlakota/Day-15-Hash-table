package com.hashtableuc1;

	public class MyHashMap<K, V> {

		MyLinkedList myLinkedList;

		public MyHashMap() {
			myLinkedList = new MyLinkedList();
		}

		public V get(K key) {
			MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.search(key);
			return myMapNode == null ? null : myMapNode.getValue();
		}

		public void add(K key, V value) {
			MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.search(key);
			if (myMapNode == null) {
				myMapNode = new MyMapNode<K, V>();
				myMapNode.setKey(key);
				myMapNode.setValue(value);
				myLinkedList.add(myMapNode);
			} else {
				myMapNode.setValue(value);
			}
		}

		public int size() {
			return myLinkedList.size();
		}

		public boolean remove(K key) {
			return myLinkedList.remove(key);
		}

		@Override
		public String toString() {
			return "MyHashMapNodes{" + myLinkedList + "}";
		}
	}
