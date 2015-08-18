package com.manju.thread.deadlock;

public class EvenAddNumber implements Runnable{

	private boolean isEvneNumber;
	
	NumberUtility nu;
	
	public EvenAddNumber(boolean en,NumberUtility num) {
		this.isEvneNumber=en;
		this.nu=num;
	}
	
	
	
	public static void main(String[] args) {
		NumberUtility nu=new NumberUtility();
		//EvenAddNumber ea=new EvenAddNumber();
		Thread even=new Thread(new EvenAddNumber(true,nu),"one");
		Thread odd=new Thread(new EvenAddNumber(false,nu),"two");
		even.start();
		odd.start();
	}

	@Override
	public void run() {
		
		 int i = isEvneNumber == true ? 2 : 1;    
		 while (i <= 10) {         
			 if(isEvneNumber == false) {      
				 nu.printEvenNo(i);     
				 }  
			 else {            
					 nu.printOddNo(i);            
			 		}         
		 i = i + 2;       
		 } 
		
	}
}
