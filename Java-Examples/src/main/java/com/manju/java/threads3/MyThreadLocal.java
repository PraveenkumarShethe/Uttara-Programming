package com.manju.java.threads3;
/**
 * this class acts as a container to our thread local variables.
 * @author muniyma
 *
 */
public class MyThreadLocal {

	public static final ThreadLocal userThreadLocal = new ThreadLocal();

	public static void set(Context user) {
		userThreadLocal.set(user);
	}

	public static void unset() {
		userThreadLocal.remove();
	}

	public static Context get() {
		return (Context) userThreadLocal.get();
	}
}