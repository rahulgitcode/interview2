
public class StringsOne {

	public static void main(String[] args){
		String a = "jahul";
		String b = "Megha";
		String test = "He is a very very good boy, isn't he?";
		
		if(a.compareTo(b) < 0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
		String[] out = test.split("[ !,?._'@]+");
		
		System.out.println(a.substring(0,1).toUpperCase()+a.substring(1));
		
		System.out.println(out.length);
		for(int k=0; k<out.length;k++){
			if(out[k]!=null){
				System.out.println(out[k]);
			}
			
		}
	}
}
