public class TestExit{
  public static void main(String[] args){
     try{
        System.exit(0);
     }
     finally{
         System.out.println("finally is always executed!");
     }
  }
}
