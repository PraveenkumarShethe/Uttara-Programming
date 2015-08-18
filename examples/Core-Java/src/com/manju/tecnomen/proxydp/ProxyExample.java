package com.manju.tecnomen.proxydp;

import java.lang.reflect.Proxy;

public class ProxyExample {
	public static void main(String[] args) {
		Animal realSubject = new Lion();
		realSubject.getSound();
		Animal proxy = (Animal) Proxy.newProxyInstance(realSubject.getClass()
				.getClassLoader(), realSubject.getClass().getInterfaces(),
				new AnimalInvocationHandler(realSubject));
		proxy.getSound();
	}

}
