package com.manju.java.threads3;
public class BusinessService {

	public void businessMethod() {
		// get the context from thread local
		Context context = MyThreadLocal.get();
		System.out.println(context.getTransactionId());
	}
}
