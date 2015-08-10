package testPackage;
public class StringMethodTest
{
	public static void main(String[] args)
	{
		String hello = "Hello", lo = "lo";
		System.out.print((testPackage.Other.hello.compareTo(hello)) + " ");    //line 1
		System.out.print((testPackage.Other.hello.equals(hello)) + " ");
		System.out.print((testPackage.Other.hello.equalsIgnoreCase(hello)) + " ");
		System.out.print((Other.hello.isEmpty()) + " ");   //line 2
		System.out.print((hello.equals("Hel"+"lo")) + " ");           //line 3
		System.out.print((hello == ("Hel"+lo)) + " ");              //line 4
		System.out.println(hello.intern() == ("Hel"+lo).intern());          //line 5
   }
}

class Other 
{ 
	static String hello = "HELLO"; 
}	
