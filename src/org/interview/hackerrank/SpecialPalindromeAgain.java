package org.interview.hackerrank;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

public class SpecialPalindromeAgain {

	public static void main(String[] args) throws IOException {
		String s = new String(Files.readAllBytes(Paths.get("C:\\\\Users\\\\e005391\\\\Desktop\\\\input05.txt")));
		System.out.println(substrCount(s.length(),s));

	}
	
	public static long substrCount(int n, String s) {
        int count = s.length();
        for(int i=0;i<s.length(); i++){
            for(int j=i+1; j<s.length(); j++){
                if(s.charAt(j)==s.charAt(i)){
                	if((j-i)==1) {
                		count++;
                		continue;
                	}
                	else{
                		String substr= s.substring(i+1,j);
                		
                		Set<Character> uniq = new HashSet<Character>();
                		for(int k=0; k<substr.length();k++) {
                			uniq.add(substr.charAt(k));
                		}
                		if(uniq.size()== 1) {
                			count++;
                			continue;
                		}else {
                			break;
                		}
                    	
                    }
                }
                
            }
        }
        return count;
    }

	private static boolean checkMiddleChars(String substring) {
		Set<Character> uniq = new HashSet<Character>();
		for(int i=0; i<substring.length();i++) {
			uniq.add(substring.charAt(i));
		}
		if(uniq.size()== 1) {
			return true;
		}
		return false;
	}

}
