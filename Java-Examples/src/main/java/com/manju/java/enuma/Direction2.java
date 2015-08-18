package com.manju.java.enuma;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum Direction2 {
	// Enum types
	EAST(0), WEST(180), NORTH(90), SOUTH(270);
	// Constructor
	private Direction2(final int angle) { // only private is permitted
		this.angle = angle;
	}

	// Internal state
	private int angle;

	public int getAngle() {
		return angle;
	}

	// Lookup table
	private static final Map<Integer,Direction2> lookup = new HashMap<Integer,Direction2>();

	// Populate the lookup table on loading time
	static {
		for (Direction2 s : EnumSet.allOf(Direction2.class))
			lookup.put(s.getAngle(), s);
	}

	// This method can be used for reverse lookup purpose
	public static Direction2 get(int angle) {
		return lookup.get(angle);
	}
	}
