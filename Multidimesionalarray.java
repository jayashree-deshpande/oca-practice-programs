public class Multidimesionalarray {

	public static void main(String[] args){
		int i = 4;
		int ia[][][] = new int[i][i = 3][i];
		int l1 = ia.length;
		for(int j = 0; j<l1 ; ++j){
			System.out.println( ia[j] );
		}
		int l2 = ia[0].length;
		int l3 = ia[0][0].length;
		System.out.println( l1 + ", " + l2 +", "+ l3 );
	}
}
