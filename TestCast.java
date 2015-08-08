public class TestCast {
	public static void main(String[] args)
	{
		final short s = Short.MAX_VALUE;
		System.out.println(s);
		char c = s;
		int x = c;
		short s1 = 1; 
		byte b = (byte) s1;
		final short s2 = 1; 
		byte b1 = s2;
		System.out.println(""+ b );
		System.out.println(""+ s2 );
		System.out.println(""+ b1);
		System.out.println(""+ x );
		System.out.println( c == Short.MAX_VALUE);
	
	}

}
