class MyException extends Exception {}
public class MyExceptionInCatch{
   public static void main(String[] args) throws MyException{
      MyExceptionInCatch tc = new MyExceptionInCatch();
      try{
         tc.m1();
      }
      catch (MyException e){
         tc.m1();
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
