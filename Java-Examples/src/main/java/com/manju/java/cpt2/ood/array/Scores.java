package com.manju.java.cpt2.ood.array;

import javax.swing.text.DefaultEditorKit.InsertBreakAction;


public class Scores {

	public static final int maxEntries=5;
	protected int numEntries;
	protected GameEntry[] entries;
	
	// Default Constructor
	
	public Scores(){
		entries=new GameEntry[maxEntries];
		numEntries=0;
		
	}
	
	
	public void add(GameEntry e){
		int newSocore=e.getScore();
		// is the new Entry e really high score?
		if(numEntries==maxEntries){
			// list is full so check with Game entry Score
			if(newSocore<=entries[numEntries-1].getScore()){
				return ; // new entry e is not a high score in this case.
			}else{
				remove(maxEntries-1);
			}
		}else{
			
		}
		
		/*int i=numEntries-1;
		System.out.println("i "+i);
		
		*/
		numEntries++;
		if(numEntries-1==0){
				entries[0]=e;
		}
		System.out.println("numEntries "+numEntries);
		for(int i=numEntries-1;i>=0;i--){
			if(null!=entries[i] &&newSocore>entries[i].getScore()){
				GameEntry old=entries[i];
				entries[i]=e;
				entries[i+1]=old;
			
				
			}
		}
	}
	
	public String toString(){
		String s="[";
		for(int i=0;i<numEntries;i++){
			if(i>0)s+=",";
			s+=entries[i];
		}
		return s+" ]";
	}
	
	/**
	 * @preCondition if index > numEntries < 0 throw exception
	 * @preCondition loop start from index and leave at last
	 * @param index
	 * @return
	 */
	
	public GameEntry remove(int index){
		GameEntry del=null;
		int i=numEntries-1; // Current size of array
		if(index<0 || index>numEntries) throw new IndexOutOfBoundsException();
		del=entries[index];
		for(int j=index;j<i;j++){			
			entries[j]=entries[j+1];
		}
		entries[i]=null;
		numEntries=i;
		
		return del;
		
	}
	
	public void insertionSortExample(int a[]){
		
		System.out.println(a.length);
		// 11 9 5 3 6 2 8 10 
		// Compare from right to left and change left to right
		
		for(int i=1;i<a.length;i++){  // index from the second character.
			
			int curr=a[i]; // the current character to be inserted
			int j=i-1; // start comparing with cell left of i
			while(j>=0 && curr < a[j]){ // 
				a[j+1]=a[j];// a[j--]  while a[j] is out of order with curr move a[j] to right and decrement j
				j--;
				a[j+1]=curr;	//  this is the right place to current 			
			}
			
		}
		for(int m=0;m<a.length;m++){
			System.out.println("After Sorting --"+a[m]);
		}
		
	}
	
	
	
	
	public static void main(String[] args){
		Scores sc=new Scores();
		sc.add(new GameEntry("Manju",10));
		sc.add(new GameEntry("Manju",30));
		sc.add(new GameEntry("Manju",20));
		sc.add(new GameEntry("Manju",50));
		sc.add(new GameEntry("Manju",1000));
		sc.add(new GameEntry("Manju",90));
		sc.remove(3);
		sc.add(new GameEntry("Manju",200));
		System.out.println(sc.toString());;
		
		int a[]={11, 9, 5, 3, 6, 2, 8, 10};
		sc.insertionSortExample(a);
	}
	

}
