public class InitTestStatic {

	static int si = 10;
	
	int  i;
	final boolean bool;
	
	public InitTest(){
		  bool = (si > 5);
		  System.out.println(bool);
		  i = 1000; 
		  System.out.println(si);
		  System.out.println(InitTest.si);
		  System.out.println(i);
	}
	
	public static void main(String[] args){
		new InitTest();
		System.out.println(si);
		
	}
	
}
