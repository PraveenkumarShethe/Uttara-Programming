package com.manju.java.cpt2.ood.array;

public class GameEntry {
	
	private String name;
	private int score;
	
	
	public GameEntry(){
		
	}
	
	public GameEntry(String iName,int iScore){
		name=iName;
		score=iScore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String toString(){
		return "( Name : "+name  +" Score : "+score+")";
	}

}
