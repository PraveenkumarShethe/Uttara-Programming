package com.manju.java.cpt8.ood.hashtable;

import java.lang.reflect.Array;


public class GenericHashTable<K,V> {

	static int CAPACITY=5;
	float loadFactor=0.75f;
	Node<K, V>[] eles;
	int size=0;
	
	public GenericHashTable(){
		eles = (Node<K, V>[]) Array.newInstance(Node.class, CAPACITY); // Make the new array;
		//eles=(Node<K, V>[]) new Object[CAPACITY];
	}
	
	/**
	 * get Has Value for the key this the position of the Node in array for this key
	 * @param key
	 * @return
	 */
	private int getHashValue(K key){


		/* Start with a base, just so that it's not 0 for empty strings */
		/*int result = 42;

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
			result += j;*/
		
		Integer hashCode=Sha1Hex.getHashInteger(key)%CAPACITY;
		//return (result % this.tableSize);
		System.out.println("Hash code for Key "+hashCode);
		return hashCode;
	}
	/**
	 * Check if key already present or not if present just update the value else hash code is same but keys are different
	 * then just add list to that position and add old and new nodes to same list (Collision  not handling in this code)
	 * @param key
	 * @return
	 */
	
	private boolean contains(K key){
		return get(key,true)!=null?true:false;
		
		
		
	}
	/**
	 * Not handling Collision
	 * @param key
	 * @return
	 */
	
	public V get(K key){
		if(null==key) return null;
		Node<K, V> value=eles[getHashValue(key)];
		return value.getValue();
	}
	public Node<K, V> get(K key,boolean node){
		if(null==key) return null;
		Node<K, V> value=eles[getHashValue(key)];
		return value;
	}
	
	public void checkLoadAndRehash(){
		
	}
	
	/**
	 * 
	 * @param node
	 */
	
	public boolean put(Node<K, V> node){
		if(node!=null  && node.getKey() !=null){
			
			if(!contains(node.getKey())){
				resize();
				int hashCode=getHashValue(node.getKey());
				System.out.println("Adding Node with key : "+node.getKey()  +" & value :"+ node.getValue() +" to  the position : "+hashCode);
				eles[hashCode]=node;
				size++;
			}else{
				Node<K, V> curNode=get(node.getKey(), true);
				System.out.println("Hash Code for Node with key : "+node.getKey() + "  Already present so Collision come into picture : just update value");
				curNode.setValue(node.getValue());
			}
			return true;
			
		}
		
		return false;
		
		
	}
	
	
	
	public Node<K, V> remove(K key){
		Node<K, V> curNode=get(key, true);
		if(null!=curNode){
			System.out.println("Deleting Node for key "+key);
			size--;
			eles[getHashValue(key)]=null;
		}
		return curNode;
		
	}
	
	public int getSize(){
		return size;
	}
	
	private void rehash(){
		if((getSize()/CAPACITY)>loadFactor){
			CAPACITY=CAPACITY+CAPACITY;
			Node<K, V>[] newEles=(Node<K, V>[])new Object[CAPACITY];
			//for(int i=0;i<getSize();i++)
		}
		
	}
	
	
	// Resize the array if necessary.
    private void resize(){
        if((getSize()/CAPACITY)<loadFactor){
            return;
        }
         int NEWCAPACITY =CAPACITY+CAPACITY; // The size of the new array
         

        @SuppressWarnings("unchecked")
        Node<K,V>[] a = (Node<K,V>[]) Array.newInstance(Node.class, CAPACITY); // Make the new array

        for(int j=0; j<CAPACITY; j++){
        	Node<K,V> q = eles[j];
            if(q==null)
                continue;

            int i = getHashValue(q.getKey());
            System.out.println("Has for "+q.getKey() +"  "+i);
            /*while (a[i]!=null && !q.getKey().equals(a[i].getKey())) {
                i = (i+1) % newcap; // get next index
            }*/
            a[i] = q;
        }
        this.eles = a;
        CAPACITY = NEWCAPACITY;
        System.out.println("New Capacity "+eles.length);
    }
	
	
	
	
	

}
