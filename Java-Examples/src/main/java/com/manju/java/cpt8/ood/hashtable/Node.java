package com.manju.java.cpt8.ood.hashtable;

public class Node<K, V> {

	K key;

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	V value;

	public Node() {

	}

	public Node(K k, V v) {
		key = k;
		value = v;

	}

	/*
	 * Equality can be based on key alone because there can't be 2 nodes with
	 * the same key in the table
	 */
	public boolean equals(Node<K, V> obj) {
		if (obj instanceof Node) {
			Node<K, V> node = (Node<K, V>) obj;
			return this.key.equals(node.getKey());
		} else {
			return false;
		}
	}

	public String toString() {
		return "Key: [" + this.key + "] data: [" + this.value + "]";
	}

}
