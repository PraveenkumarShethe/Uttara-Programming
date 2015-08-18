package com.manju.java.serialize3;

import java.io.Serializable;

public class SerializeMe implements Serializable {
    private static final long serialVersionUID = 1L;

    static private int data;
    private final int manju=50;
    transient String manju1;
    
   
    
    public String getManju1() {
		return manju1;
	}

	public void setManju1(String manju1) {
		this.manju1 = manju1;
	}

	public SerializeMe (int data) {
      //  this.data = data;
    }
    
  /*  public SerializeMe () {
      
    }*/
    
    

    public int getData() {
        return data;
    }

	public int getManju() {
		return manju;
	}

	public void setManju(int manju) {
	//	this.manju = 10;
	}
}

