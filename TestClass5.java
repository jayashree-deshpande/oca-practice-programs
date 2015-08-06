public class TestClass5{
  static int someInt = 10;
  public static void changeIt(int a){
	  someInt = 20;
  }
  public static void main(String[] args){
    changeIt(someInt);
    System.out.println(someInt);
  }
}
