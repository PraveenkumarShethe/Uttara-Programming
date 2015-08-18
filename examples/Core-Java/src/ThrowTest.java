
public class ThrowTest {
	
	public static void testExp() throws Exception
	{
		try{
			String a=null;
			a.toString();
		}catch (Exception e) {
			throw new Exception("Manju");  // add throws in method declaration part or sorround  by try{}catch(){}
		}finally{
			System.out.println("FINALY");
		}
		
	}

	public static void main(String[] args) throws Exception {
	
		try {
			testExp();
		} /*catch (Exception e) {
			e.printStackTrace();
		}*/finally{
			System.out.println("HI");
		}
			
			//throw new Exception("ABC");
		
		// if catch result is FINALLY- EXP MANJU & HI
		//if only finally FINALLY & HI
	}
	
}
