package com.manju.java.threads3;

public class ThreadGroupDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	      ThreadGroup tg = new ThreadGroup ("subgroup 1");
	      Thread t1 = new Thread (tg, "thread 1");
	      Thread t2 = new Thread (tg, "thread 2");
	      Thread t3 = new Thread (tg, "thread 3");
	      tg = new ThreadGroup ("subgroup 2");
	      Thread t4 = new Thread (tg, "my thread");
	      tg = Thread.currentThread ().getThreadGroup ();
	      int agc = tg.activeGroupCount ();
	      System.out.println ("Active thread groups in " + tg.getName () +
	                          " thread group: " + agc);
	      tg.list ();}

}
