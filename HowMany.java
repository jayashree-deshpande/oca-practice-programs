public class HowMany{
	public static int count(int a){
		
		if(a != 3)
		{
			int b = 1;
		}
		else
		{
			int b = 2;
		}
		int b = 0;
		return a++ + b;
	}
	public static void main(String[] args)
	{
		System.out.println(count(3));
		System.out.println(count(9));
	}
}
