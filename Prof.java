
class Teacher{
      void teach(String student){
          /* lots of code */
    	  System.out.println("in Teacher.teach");
      }
      
      final void add(int a, int b){
    	  System.out.println("in Teacher.add");
      }
}
public class Prof extends Teacher{
        //1
	final void teach(String student){
		System.out.println("in Prof.teach");
	}
	public void add(int a, int b){
		System.out.println("in Prof.add");
	}
	
	public static void main(String[] args){
		
		Teacher t1 = new Teacher();
		t1.add(0, 0);
		t1.teach(null);
		
		Teacher t2 = new Prof();
		t2.add(0, 0);
		t2.teach(null);
		
		Prof p1 = new Prof();
		p1.add(0, 0);
		p1.add(0f, 0f);
		p1.teach(null);
	
	}
}
