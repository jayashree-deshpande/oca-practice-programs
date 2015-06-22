class Dino{
	//Unresolved compilation problem: 
	static final String species;
	double weight;
	{species = "Raptor" ;}
	public Dino(double weight){
		this.weight = weight;
	}
	
	public static void main(String[] args){
		Dino d = new Dino(500);
		System.out.println(d.weight);
	}
}
