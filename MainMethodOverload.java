class  MainMethodOverload{
	
	public static void main(long[] args){
		System.out.println("long");
	}
	
	public static void main(int[] args){
		System.out.println("int");
		}
	
	public static void main(boolean args){
		System.out.println("bool");
	}
	
	public static void main(String[] args){
		System.out.println("void");
		int[] a = {1,2,3,4};
		long[] b = {};
		Employee.main(a);
		Employee.main(b);
	}
	
}
