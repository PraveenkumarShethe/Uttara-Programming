package com.manju.java.enuma;

public class Direction2Test {

	// Reverse Lookup Example.....
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Angle lookup
		System.out.println(Direction2.NORTH.getAngle());
		// Reverse lookup by angle
		System.out.println(Direction2.get(90));
	}
	}


