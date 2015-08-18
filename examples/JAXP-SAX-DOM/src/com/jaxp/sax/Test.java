package com.jaxp.sax;

import java.util.ArrayList;
import java.util.List;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> mm=new ArrayList<String>();
		/*mm.add("Manju");
		mm.add("Manju1");
		mm.add("Manju12");
		mm.add("Manju13");
		mm.add("Manju14");*/
		
		StringBuilder ff=new StringBuilder();
		for(String n:mm)
		{   
			ff.append("\"");
			ff.append(n);
			ff.append("\"");
			ff.append(",");
			
		}
		if(ff.length()>0)ff.replace(ff.length()-1, ff.length(),"");
		String[] dd=ff.toString().split(",");
		System.out.println("ddd  "+dd.length);
		System.out.println(ff.length());
		//String[] dd={"manju","anu"};//	ff.substring(0,ff.length()-1);
		//System.out.println("ddd "+dd);
		System.out.println("ss" +ff);
		String[] vv={"Manju","Manju1","Manju12","Manju13","Manju14"};
		System.out.println(vv.length);
	}

}
