package com.manju.java.enuma;

public enum Direction1 {
	
	// Defining template Method in enum type

	// Enum types
	EAST(0) {
		@Override
		public void shout() {
			System.out.println("Direction is East !!!");
			
		}

		@Override
		public void printValues() {
			for(Direction1 a:Direction1.values()){
				String b;
				
				System.out.println(" Name :  "+a.name()  +" Ordinal (Order) : "+a.ordinal() +" value  :  " +a.getAngle() + " toString: "+a.toString());
			}
			
		}
	},
	WEST(180) {
		@Override
		public void shout() {
			System.out.println("Direction is West !!!");
		}

		@Override
		public void printValues() {
			for(Direction1 a:Direction1.values()){
				System.out.println(" Name :  "+a.name()  +" Ordinal (Order) : "+a.ordinal() +" value  :  " +a.getAngle() + " toString: "+a.toString());
			}
			
		}
	},
	NORTH(90) {
		@Override
		public void shout() {
			System.out.println("Direction is North !!!");
		}

		@Override
		public void printValues() {
			for(Direction1 a:Direction1.values()){
				System.out.println(" Name :  "+a.name()  +" Ordinal (Order) : "+a.ordinal() +" value  :  " +a.getAngle() + " toString: "+a.toString());
			}
			
		}
	},
	SOUTH(270) {
		@Override
		public void shout() {
			System.out.println("Direction is South !!!");
		}

		@Override
		public void printValues() {
			for(Direction1 a:Direction1.values()){
				System.out.println(" Name :  "+a.name()  +" Ordinal (Order) : "+a.ordinal() +" value  :  " +a.getAngle() + " toString: "+a.toString());
			}
			
		}
	};
	// Constructor
	private Direction1(final int angle) {
		this.angle = angle;
	}

	// Internal state
	private int angle;

	public int getAngle() {
		return angle;
	}

	// Abstract method which need to be implemented
	public abstract void shout();
   public abstract void printValues();
	
	
	
}
