public class ParseFloat{
	
	public float parseFloat(String s)
	{
		float f = 0.0f;
		try{
			f = Float.valueOf(s).floatValue();
			return f ;
		}
		catch(NumberFormatException nfe){
			System.out.println("Invalid input " + s);
			f = Float.NaN ;
			return f;
		}
		finally 
		{ System.out.println("finally");  }
		//return f ;
	}
	
	public static void main(String[] args){
		System.out.println(new ParseFloat().parseFloat("0.1"));
		System.out.println(new ParseFloat().parseFloat("0x.1"));
		System.out.println(new ParseFloat().parseFloat("1"));
	}
}
