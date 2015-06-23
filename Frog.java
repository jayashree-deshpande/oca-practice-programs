//Understanding constructor name and method name

import java.util.ArrayList;
import java.util.List;

class Frog{
	public int Frog(){return 0;}
	private List<Integer> legs;
	public Frog(){
		legs = new ArrayList<Integer>();
		for(int i=0 ; i<4 ; i++){
			legs.add(i);
		}
	}
	
	public static void main(String[] args){
		Frog f = new Frog();
		f.Frog();
	}
}
