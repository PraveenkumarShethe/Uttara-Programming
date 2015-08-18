package com.manju.java.generics1;

import java.util.ArrayList;
import java.util.List;

public class TypeErasure {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Runtime time of ArrayList<String>  "+new ArrayList<String>().getClass());
		System.out.println("Runtime time of ArrayList<Long>  "+new ArrayList<Long>().getClass());
		List<? super Number> s=new ArrayList<Number>();
		s.add(new TypeErasure().new Manju());
		// TODO Auto-generated method stub

	}
	
	class Manju extends Number{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
		public double doubleValue() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public float floatValue() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int intValue() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public long longValue() {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}

}
