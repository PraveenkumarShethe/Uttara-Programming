package com.manju.thread.race;

import java.util.HashMap;
import java.util.Map;

public class Counter {
	// shared variable or resource
	Integer count = Integer.valueOf(0);
	private Map<String, Integer> userToNumber = new HashMap<String, Integer>(10);
	private Object mutex = new Object(); // a lock

	public void increment() {
		try {
			
			synchronized (mutex) {
				System.out.println("Enetr "+Thread.currentThread().getName());
				count = count + 1; // operation 1
				
				Thread thread = Thread.currentThread();
				userToNumber.put(thread.getName(), count); // operation 2
				
				//Thread.sleep(1000);
				//Thread thread = Thread.currentThread();
				
			} // there could be other operations here that uses the shared
			System.out.println("exit "+Thread.currentThread().getName());
			// resource as read only
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Integer getCount(String name) {
		System.out.println(Thread.currentThread().getName() + " value is "+ userToNumber.get(name));
		return userToNumber.get(name);
	}

}
