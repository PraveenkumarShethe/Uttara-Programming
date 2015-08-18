package com.manju.tecnomen.unreachable;

import java.util.ArrayList;

public class TestFinalize {

	public ArrayList a1 = new ArrayList();

	public static TestFinalize t1;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		t1 = new TestFinalize();
		t1.useObject();

		while (true) {
			System.out.println("size of array:" + t1.a1.size());

			if (t1.a1.size() == 0)
				{
				//System.gc();
				
				}
			else {
				System.out.println("size of array:" + t1.a1.size());
				System.exit(0);
			}
		}
	}

	public void setObj(ArrayList a1) {
		this.a1 = a1;
	}

	private void useObject() {
		HaveFinalizeMethod h1 = new HaveFinalizeMethod();
		h1.setABC(5000);
		//h1 = null;

	}

}

class HaveFinalizeMethod {

	public int abc = 99;
	private ArrayList a1 = new ArrayList();

	public void finalize() {

		a1.add("Gyani");
		TestFinalize.t1.setObj(a1);
	}

	public void setABC(int asd) {
		abc = asd;

	}
}
