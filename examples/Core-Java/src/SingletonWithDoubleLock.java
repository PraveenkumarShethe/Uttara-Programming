/**
 * Class with Double Lock 
 * @author muniyma
 *
 */
public class SingletonWithDoubleLock {
	
	private static SingletonWithDoubleLock sinDoubleLock=null;
	
	
	private SingletonWithDoubleLock()
	{
		
	}

	public static SingletonWithDoubleLock getInstance()
	{
		
		//System.out.println("$$$$$$$$$$$$$  "+sinDoubleLock);
		if(null==sinDoubleLock)
		{
			System.out.println("Null Manju-------------");
			synchronized (SingletonWithDoubleLock.class) {
				if(null==sinDoubleLock)
				{
					sinDoubleLock=new SingletonWithDoubleLock();
				}
				
			}
		}
		System.out.println("$$$$$$$$$$$$$        "+sinDoubleLock.hashCode());
		return sinDoubleLock;
	}
	
	
}
