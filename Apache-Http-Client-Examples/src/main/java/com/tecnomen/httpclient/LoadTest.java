package com.tecnomen.httpclient;

public abstract class LoadTest {

	private String asvip;
	private int noOfcalls = 1;
	private long timeForCalls = 1;// in seconds

	public String getAsvip() {
		// return asvip;
		return "http://localhost:8080/";
	}

	public void setAsvip(String asvip) {
		this.asvip = asvip;
	}

	public int getNoOfcalls() {
		return noOfcalls;
	}

	public void setNoOfcalls(int noOfcalls) {
		this.noOfcalls = noOfcalls;
	}

	public long getTimeForCalls() {
		return timeForCalls;
	}

	public void setTimeForCalls(long timeForCalls) {
		this.timeForCalls = timeForCalls;
	}
	
	

}
