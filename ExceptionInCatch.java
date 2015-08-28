class MyException extends Exception {}
public class ExceptionInCatch{
   public static void main(String[] args){
      ExceptionInCatch tc = new ExceptionInCatch();
      try{
         tc.m1();
      }
      catch (MyException e){
         try {
			tc.m1();
		} catch (MyException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
      }
      finally{
         tc.m2();
      }
   }
   public void m1() throws MyException{
      throw new MyException();
   }
   public void m2() throws RuntimeException{
      throw new NullPointerException();
   }
}
