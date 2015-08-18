
public class RFC822 {
	
	public static void main(String[] args) {
		
		String faxAddress="FAX=24644592/cover=http://10.50.15.11/cover.txt&resgroup=default";
		String gateway="localhost";
		faxAddress = "\""+faxAddress+"\""+("@" + gateway);
		System.out.println("faxAddress   "+faxAddress);
	}

}
