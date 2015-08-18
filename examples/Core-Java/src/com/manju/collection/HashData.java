package com.manju.collection;

public class HashData<Key, Value, E> {
	Key key;
	Value value;
	
	ManjuList<E>  list;
	
	public void initList(){
        if(list == null)
              list = new ManjuList<E>();
  }


}
