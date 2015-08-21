public class InitTest2{
   static int si = 10;
   private int  i;
   final boolean bool;
   
   public InitTest(){
	   bool = (si > 5); 
	   i = 1000; 
	   System.out.println(bool);
	   System.out.println(i);
   }
  /* { 
	   bool = (si > 5); 
	   i = 1000; 
	   System.out.println(bool);
	   System.out.println(i);
   }*/
   
   public static void main(String[] args){
	   new InitTest();
   }
}
