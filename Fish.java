// Understanding 'super','static' and 'this' access modifier 'private'
public class Fish{
	private static String getcolor(){ return "Yellow";}
	public static void main(String[] args){
		//Fish x = new Fish();
		new Pufferfish().printDescription();
	}
}
	
class Pufferfish extends Fish{
	protected static String getColor(){return "Green" ;}
	public void printDescription(){
		System.out.println(super.getcolor()+","+this.getColor()+","+getColor());
	}
		
}
	
