package com.manju.exception;

public class Test {
	
	
	
	public static void main(String[] args) {
		
		try {
			CheckedRuntime.checkedExceptionTest();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		CheckedRuntime.runTimeExceptiondTest();
	}

}
