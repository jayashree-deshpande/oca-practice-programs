class Protected{
	
	int a;
	private int b;
	protected void c(){ }
	public int d(){  return 0; }
	public void myF(){
		System.out.println("---myF---");
	}
	
}


public class myProtected extends Protected {
	
	public int x = 0;
	public void f(){
		System.out.println("---in f()---");
	}
	
	public void myF(){
		System.out.println("---derived myF---");
	}
	
	
	public static void main(String[] args) {
		Protected ref = new Protected();
		ref.a = 10;
		ref.c();
		ref.d();
		ref.myF();
		
		Protected ref1 = new myProtected();
		ref1.a = 20 ;
		ref1.c();
		ref1.d();
		ref1.myF();
		
		myProtected ref2 = new myProtected();
		ref2.a = 30;
		ref2.c();
		ref2.d();
		ref2.myF();
		ref2.x = 40;

    }
}
