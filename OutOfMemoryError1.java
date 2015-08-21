import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryError1{
	
	
	public static void main(String[] args){
		 List s1 = new ArrayList( );
	        try{
	            while(true){
	            	System.out.println(s1.size());
	                s1.add("sdfa");
	            }
	        }catch(RuntimeException e){
	            e.printStackTrace();
	        }
	        System.out.println(s1.size());
	}
}
