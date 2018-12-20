package org.interview.dynamicprogramming;

public class Fibonacci {
	public static void main(String[] args){
		
		int num = 7;
		
		int res = fib(num);
		
		System.out.println(res);
		
	}

	private static int fib(int num) {
		int[] fib = new int[num+1];
		
		fib[0] = 0;
		fib[1] = 1;
		
		for(int i=2; i<=num; i++){
			fib[i] = fib[i-1]+fib[i-2];
		}
		
		return fib[num];
	}

}
