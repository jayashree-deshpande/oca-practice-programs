class A{
    String value = "test";
    A(String val){
        this.value = val;
    }
}
public class TestClass {
    public static void main(String[] args) throws Exception {
        new A("new test").print();
    }
}
