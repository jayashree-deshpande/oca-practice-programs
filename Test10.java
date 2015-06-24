
//To understand 'throws' and 'throw' 

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test10{
	public static void eat() throws IOException{
		try{
			System.out.println("1");
			throw new IOException();
		}
		catch(IOException e){
			System.out.println("2");
			throw e;
		}
		finally{
			System.out.println("3");
		}
	}
	
	//error on line 24 main method needs to throw Exception 
	public static void main(String[] args){
		eat();
		System.out.println("4");
	}
}
