package org.interview.unittesting;

public class StringConcatenate {
	
	public String concatenate(boolean flag, String a, String b){
		String result = null;
		if(flag){
			result = a+b;
		}
		return result;
	}
}
