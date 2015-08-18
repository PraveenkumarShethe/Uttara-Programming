package com.manju.java.cpt8.ood.hashtable;

public class GHTableTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GenericHashTable<Integer, String> hashTable=new GenericHashTable<>();
		hashTable.put(new Node<Integer, String>(1,"Manju"));
		hashTable.put(new Node<Integer, String>(2,"Manju"));
		hashTable.put(new Node<Integer, String>(3,"Manju"));
		hashTable.put(new Node<Integer, String>(4,"Manju"));
		hashTable.put(new Node<Integer, String>(5,"Manju"));
		hashTable.put(new Node<Integer, String>(6,"Manju"));

	}

}

