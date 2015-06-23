//Program to show that the varibale 'z' is not initialized and the wrong use of '+=' with 'z'

class Test4{
	public static void main(String[] args)
	{
		int x = 10%2;
		int y = 3/5+ ++x;
		int z += 4 * x;
		System.out.print(x +"," + y + ","+ z);
	}
}
