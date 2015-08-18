package com.manju.tecnomen.annoatations;

public class NGMModules {
	
	@Developer(value="Manju",value1="Two")
	public void masDev()
	{
		System.out.println("Manju----");
	}
	@Developer("MAnjui1")
	public void eventDev(){
		System.out.println("Manju----2");
	}
	@Developer("Manju33")
	public void systemDev()
	{
		System.out.println("Manju----3");
	}
}

