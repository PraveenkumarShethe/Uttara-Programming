package com.manju.java.cpt8.ood.hashtable;

import java.util.LinkedList;

public class ManjuHT<K, V> {
	// http://www.danielacton.com/Data-Structures/Hashtable/Java/

	// Part 1: The hash table node class

	private class Node<K, V> {
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
		 * Equality can be based on key alone because there can't be 2 nodes
		 * with the same key in the table
		 */
		public boolean equals(Object obj) {
			System.out.println("Eq  "+obj);
			if (obj instanceof Node) {
				Node<?, ?> node = (Node<?, ?>) obj;
				return this.key.equals(node.getKey());
			} else {
				return false;
			}
		}

		public String toString() {
			return "Key: [" + this.key + "] data: [" + this.value + "]";
		}

	}

	// Part 2: The backing table

	// The Backing table might be Fixed array or Dynamic array or Linked List
	private final int tableSize = 4;
	private int numElements;
	private Object[] table;
	
	public ManjuHT(){
		table=new Object[tableSize];
	}
	

	// Part 3: The hash method

	private int hash(K key) {

		/* Start with a base, just so that it's not 0 for empty strings */
		int result = 42;

		String inputString = key.toString().toLowerCase();

		char[] characters = inputString.toCharArray();
		for (int i = 0; i < characters.length; i++) {
			char currentChar = characters[i];

			if (currentChar == 'a' || currentChar == 'b' || currentChar == 'c'
					|| currentChar == 'e' || currentChar == 'e'
					|| currentChar == 'f') {
				result += Integer.parseInt("" + currentChar, 16);
			}

			int j = (int) currentChar;
			result += j;
		}
System.out.println(key +"Hash for key "+(result % this.tableSize));
		return (result % this.tableSize);
	}

	// Part 4: The add method(s)

	public void add(K key, V data) {
		if (data == null || key == null) {
			System.err.println("ERROR: Either the key or the data are null");
			return;
		}

		/* Don't add duplicate keys */
		if (this.contains(key)) {
			return;
		}

		/* Find out where in our array should the item go */
		int position = this.hash(key);

		/* If nothing exists in the position, create a new linked list there */
		if (this.table[position] == null) {
			this.table[position] = new LinkedList();
		}

		/* Add to the linked list in the appropriate position */
		((LinkedList) this.table[position]).add(new Node(key, data));
		this.numElements++;
	}

	public void add(K[] keys, V[] inputData) {
		for (int i = 0; i < inputData.length; i++) {
			this.add(keys[i], inputData[i]);
		}
	}

	// Part 5: The remove method(s)

	public void remove(K key) {
		int hashVal = this.hash(key);

		if (this.table[hashVal] != null) {
			Node node = new Node();
			node.setKey(key);

			if (((LinkedList) this.table[hashVal]).indexOf(node) > -1) {
				((LinkedList) this.table[hashVal]).remove(node);
				this.numElements--;
			}
		}
	}

	public String toString() {
		StringBuffer buffer = new StringBuffer();

		buffer.append(System.getProperty("line.separator"));
		buffer.append("{");
		buffer.append(System.getProperty("line.separator"));

		for (int i = 0; i < this.table.length; i++) {
			if (this.table[i] != null) {
				buffer.append("\t" + (LinkedList) this.table[i]);
				buffer.append(System.getProperty("line.separator"));
			}
		}

		buffer.append("}");

		return buffer.toString();
	}

	public int getNumElements() {
		return this.numElements;
	}

	public boolean contains(K key) {
		boolean result = false;
		int hash = this.hash(key);

		if (this.table[hash] != null) {
			Node node = new Node();
			node.setKey(key);
			if (((LinkedList) this.table[hash]).indexOf(node) > -1) {
				result = true;
			}
		}

		return result;
	}
	// Part 6: The helper methods
	
	public static void main(String[] args){
		ManjuHT<Integer, String> st=new ManjuHT<>();
		st.add(3, "Ovveride");
		st.add(1, "manju");
		st.add(2, "manju");
		st.add(3, "dfd");
		
		System.out.println(st);
		
		
		
	}

}
