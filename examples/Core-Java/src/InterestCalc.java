public class InterestCalc {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		int amount;
		int principal = 90465;
		
		for(int month=1;month<=10;month++)
		{
			
			amount=(int) ((principal/100)*1.17);	
			
			System.out.println(" "+principal+  "\t"    +amount+   "\t"+      (amount+principal) );
			
			principal=amount+principal;
		}
		//System.out.println(principal);
	}
	

}
