public class Test2{
	public static void main(String[] args)
	{
		String numbers = "2468";
		int total = 0;
		total += numbers.indexOf("6");
		total += numbers.indexOf("9");
		char ch = numbers.charAt(3);
		System.out.println(total + " " + ch);
	}
}
