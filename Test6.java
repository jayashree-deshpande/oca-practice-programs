public class Test6{
	
	public static void main(String[] args){
		int[] num = new int[] {1,0,2};
		Object p = num;
		int[] two = (int[]) p;
		System.out.println(10 / two[2]);
	}
}
