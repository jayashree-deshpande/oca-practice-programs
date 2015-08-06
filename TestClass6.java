class A{
    String value = "test";
    A(String val){
        this.value = val;
    }
}
public class TestClass6 {
    public static void main(String[] args) throws Exception {
        System.out.println(new A("new test").toString());
    }
}
