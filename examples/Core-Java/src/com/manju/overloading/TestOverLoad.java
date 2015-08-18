package com.manju.overloading;

import java.sql.SQLException;

public class TestOverLoad {

	/**
	 * @param args
	 */
	/**
	 * Overloading is using the same method name but different number/type/order parameters .

	 */
	
	private void manju(int a) throws SQLException{
		
	}
	
	public int manju(float a) throws Exception{
		return 0;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     TestOverLoad nn=new TestOverLoad();
     try {
		int a=nn.manju(1f);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
