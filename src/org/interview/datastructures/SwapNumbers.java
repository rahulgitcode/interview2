package org.interview.datastructures;

public class SwapNumbers {
	
	public static void main(String[] args){
		int x = 10;
		int y = 30;
		
		System.out.println("Before Swap: "+"x: "+x+" y:"+ y);
		
		x= x+y; //x=40
		y=x-y; //y=10
		x=x-y; //30
		
		System.out.println("After Swap: "+"x: "+x+" y:"+ y);
		
	}
	
}
