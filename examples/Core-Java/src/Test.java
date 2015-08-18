import java.util.ArrayList;
import java.util.List;

public class Test {

	static int j;

	public static void main(String[] args) {
	//	SingletonWithDoubleLock.getInstance();
		//SingletonWithDoubleLock.getInstance();
		String s=null;

		s.length();

		int a=10/0;

		ArrayList<ArrayList<String>> listOlists = new ArrayList<ArrayList<String>>();
		ArrayList<String> singleList = new ArrayList<String>();

		singleList.add("hello");
		singleList.add("world");
		listOlists.add(0,singleList);
		ArrayList<String> singleList1 = new ArrayList<String>();

		singleList.add("hello1");
		singleList.add("world1");
		listOlists.add(1,singleList1);

		for (int i = 0; i < listOlists.size(); i++) {
			List<String> nn=(List)listOlists.get(i);
			for (int j = 0; j < nn.size(); j++) {
					System.out.println(nn.get(j));
				}
		//	System.out.println(listOlists.get(i));
		}
		ArrayList<String> mm = new ArrayList<String>();
		ArrayList<String> mm1 = new ArrayList<String>();
		for (int i = 0; i < 20; i++) {
			mm1.add("Manju" + i);
		}
		mm.addAll(0, mm1);
		for (int i = 0; i < 20; i++) {
		//	System.out.println(mm.get(i));
		}
		int i;
		do{
			 i=getint();
			 System.out.println(i);
		}while(i<10);

		System.out.println("Continued ....");
	}


	public static int getint()
	{
		System.out.println("mNJU");
		return j++;
	}


}
