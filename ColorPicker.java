class ColorPicker{
	public void pickColor(){
		try{
			System.out.print("A");
			fail();
		}
		catch(NullPointerException e){
			System.out.print("b");
		}
		finally{
			System.out.print("c");
		}
	}
	
	public void fail(){
		throw new ArithmeticException();
	}
	
	public static void main(String[] args){
		new ColorPicker().pickColor();
		System.out.print("d");
	}
}
