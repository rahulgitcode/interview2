package org.interview.hackerrank;

public class TimeinMillis {
	public static void main(String[] args) throws InterruptedException{
		String s= "1,2,3,4,5;2";
		
		StringBuffer inputBuf = new StringBuffer(s);
		
		int len=1;
		int maxlen = 3;
		int x =1;
		while(len<s.length()){
			String temp = s.substring(0, len);
			inputBuf = inputBuf.append(new StringBuffer(temp).reverse());
			len = len+2;
		}
		
		System.out.println(inputBuf);
	}

}
