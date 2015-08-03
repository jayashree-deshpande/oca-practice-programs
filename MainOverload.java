class  MainOverload{
	
	public static long main(long[] args){
		System.out.println("long");
		return 0;
	}
	
	public static int main(int[] args){
		System.out.println("int");
		return 0;}
	
	public static boolean main(boolean args){
		System.out.println("bool");
		return true;}
	
	public static void main(String[] args){
		System.out.println("void");
		int[] a = {1,2,3,4};
		long[] b = {};
		Employee.main(a);
		Employee.main(b);
	}
	
}
	
		
	
			
		
	
	

