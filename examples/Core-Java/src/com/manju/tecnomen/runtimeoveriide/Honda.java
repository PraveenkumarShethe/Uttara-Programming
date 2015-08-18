package com.manju.tecnomen.runtimeoveriide;

/**
 * Run Time Polymorphism can't be achived by Data memebers
 * @author muniyma
 *
 */
public class Honda extends Bike {
	
	public Honda()
	{
		System.out.println("Honda");
	}
	public Honda(int a)
	{
		this.speedlimit=100;
		System.out.println("Honda");
	}
	
int speedlimit=80;
public static void main(String[] args) {
	Bike b=new Honda(100);
	System.out.println(b.speedlimit);
	Honda c=new Honda(100);
	System.out.println(c.speedlimit);
}
}
