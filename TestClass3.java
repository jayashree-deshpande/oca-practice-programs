class Data {
    int x = 0, y = 0;
    public Data(int x, int y){
        this.x = x; this.y = y;
    }
}
public class TestClass3 {
    public static void main(String[] args) throws Exception {
        Data d = new Data(1, 1);
        d.x += 1;
        d.y += 1;
        System.out.printf("x is="+d.x+" y is="+d.y);
    }
}
