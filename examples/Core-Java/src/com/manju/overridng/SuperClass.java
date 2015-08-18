package com.manju.overridng;

import java.sql.SQLException;

public class SuperClass {
	
	int x=10;
	public SuperClass(){
		
	}
	
public SuperClass(int x){
		this.x=x;
	}
	

public void methodA()
{
	System.out.println("Super Class A "+x);
}
	
	private void manju()
	{
	System.out.println("1");	
	}
	
	
	public void manju1() throws SQLException
	{
		System.out.println("2");	
	}
	
	protected void manju2(){
		System.out.println("3");
	}

	void manju3(){
		System.out.println("4");
	}
	
	final void manju4()
	{
		System.out.println("5");
		
	}
	
	static void manju5()
	{
		System.out.println("6");
	}
	
}
