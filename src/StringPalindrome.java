import java.util.Scanner;

public class StringPalindrome {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		String str = input.next();
		boolean flag = true;
		
		for(int i=0, j=str.length()-1; i<str.length();i++, j--){
			if(str.charAt(i) != str.charAt(j)){
				System.out.println("Not a palindrome");
				flag = false;
				break;
			}
			
		}
		
		if(flag){
			System.out.println("String is a palindrome");
		}
		
	}

}
