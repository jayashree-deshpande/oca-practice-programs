public class Test1{
	
	public static void main(String[] args)
	{
		StringBuilder s1 = new StringBuilder("meo");
		StringBuilder s2 = new StringBuilder("meo");
		if(s1 == s2)
			System.out.println("one");
		if(s1.equals(s2))
			System.out.println("two");
		// Compiler gives error on the following line String and StringBuilder cannot be compared
		if(s1 == "meo")
		  System.out.println("three");
		if(s1.toString() == "meo")
			System.out.println("four");
		if(s1.toString().equals(s2))
			System.out.println("four");
	}
}
