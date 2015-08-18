package com.manju.set;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.manju.list.ListExample;

/*
 * Cannot Contain Duplicates
 * It wont maintain order
 * allows null also
 * HashSet : which stores its elements in a hash table, is the best-performing implementation; 
 * 	however it makes no guarantees concerning the order of iteration
 * TreeSet :which stores its elements in a red-black tree, orders its elements based on their values; it is substantially slower than HashSet
 * 
 * LinkedHashSet :LinkedHashSet spares its clients from the unspecified,
 * 	 generally chaotic ordering provided by HashSet at a cost that is only slightly higher.
 */

public class SetExample extends ListExample implements Serializable{

	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		set.add(null);
		set.add(null);
		set.add("ma");
		for(String s:set)
			System.out.println(s);
		
	String s1="hello";
	s1.concat("manju");
	System.out.println(s1);
	}
}
