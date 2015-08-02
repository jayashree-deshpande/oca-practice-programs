public class InitTest {

	static int si = 10;
	int  i;
	final boolean bool;
	
	public InitTest(){
		  bool = (si > 5);
		  System.out.println(bool);
		  i = 1000; 
		  System.out.println(i);
		   }
	
	public static void main(String[] args){
		new InitTest();
	}
	
}
