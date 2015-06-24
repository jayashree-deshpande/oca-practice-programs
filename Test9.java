// To understand various methods in List class-java

import java.util.ArrayList;
import java.util.List;

class Test9{
	public static void main(String[] args){
		
		List<String> L = new ArrayList<>();
		L.add("gf");
		System.out.println(L.size());
		L.add("minnow");
		System.out.println(L.size());
		L.remove("gf");
		System.out.println(L.size());
		System.out.println(L.contains("Shark"));
		System.out.println(L.remove("Shark"));
		System.out.println(L.size());
	}
}
