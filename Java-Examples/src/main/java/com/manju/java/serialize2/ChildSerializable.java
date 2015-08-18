package com.manju.java.serialize2;

import java.io.Serializable;

public class ChildSerializable extends ParentNonSerializable implements	Serializable {

	private static final long serialVersionUID = 1L;
	String color;

	ChildSerializable() {
		this.noOfWheels = 8;
		this.color = "blue";
	}
}