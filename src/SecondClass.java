
public abstract class SecondClass extends FirstClass{
	private int i;
	public static void test(){
		System.out.println("Yeah");
	}
	
	public abstract int counter();
	
	public int returnInt(){
		return this.i;
	}
}
