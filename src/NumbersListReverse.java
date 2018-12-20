public class NumbersListReverse {
	
	public static void main(String[] args){
		String s= "1,2,3,4,5;2";
		String[] arr = s.split("[,;]");
		
		for(String x: arr){
			System.out.println(x);
		}
		
	}

}
