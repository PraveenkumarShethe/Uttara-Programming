package com.manju.exception;


public class CheckedRuntime {
	
	
	public static void checkedExceptionTest()
	{
		try{
		throw new CustomCheckedException(); 
		}catch (Exception e) {
			// TODO: handle exception
		}// 
		//as this is checked exception we need to catch or throws from this method
		// if u add throws added then calling method should catch/throws this exception else source wont compile.
		// if u add try/catch here it self then calling method need not to worry about catch the exception.
		// if u try to catch on calling method it wont compile as that exception is not reachable( U can catch general Exception not Custom Exception 
	}
	
	public static void runTimeExceptiondTest()
	{
		throw new CustomRunTimeException(); // as this is custom run time exception , compiler wont worry about this 
		// even calling method doesn't ask u to catch exception at Compile time
	}
	
	

}
