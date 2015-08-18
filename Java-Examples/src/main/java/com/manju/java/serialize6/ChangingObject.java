package com.manju.java.serialize6;

import java.io.Serializable;

public class ChangingObject implements Serializable {
	public int foo;
	private Type type;
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	
	
}