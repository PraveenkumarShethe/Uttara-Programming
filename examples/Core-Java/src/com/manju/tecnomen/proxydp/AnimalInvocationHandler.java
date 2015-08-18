package com.manju.tecnomen.proxydp;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AnimalInvocationHandler implements InvocationHandler {
	private Object realSubject = null;

	public AnimalInvocationHandler(Object realSubject) {
		this.realSubject = realSubject;
	}

	@Override
	public Object invoke(Object proxy, Method m, Object[] args)
			throws Throwable {
		Object result = null;
		try {
			result = m.invoke(realSubject, args);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return result;
	}

}
