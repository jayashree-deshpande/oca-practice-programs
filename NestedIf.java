public class NestedIf{

	public static void ifTest(boolean flag)
	{
		if (flag)   //1
		{
			if (flag)   //2
				System.out.println("True False");
			else        // 3
				System.out.println("True True");
		}
		else        // 4
			System.out.println("False False");
	}
	
	public static void main(String[] args){
		ifTest(false);
		ifTest(true);
		
	}
}
