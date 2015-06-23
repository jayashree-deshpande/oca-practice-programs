//program to show the wrongly placed finally 
public class Test7{
	
	Integer x = null;
	int  y = 0;
	
	{		
	if(x == y)
	{
		System.out.println("1");
	}
	else
	{
		System.out.println("2");
	}
			}
	finally
	{
		System.out.println("3");
	}
}
