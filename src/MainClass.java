
public class MainClass {
	public static void main(String[] args){
		SecondClass.test();
		ThirdClass th = new ThirdClass();
		System.out.println(th.counter()+" "+th.returnInt());
	}
}
