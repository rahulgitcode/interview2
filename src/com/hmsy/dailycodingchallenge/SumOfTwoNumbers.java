package com.hmsy.dailycodingchallenge;

/**
 * 
 * 
This problem was recently asked by Google.

Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

Bonus: Can you do this in one pass?
 * 
 * @author e005391
 *
 */
public class SumOfTwoNumbers {

	public static void main(String[] args) {
		
		int[] arr = {10,15,3,7};
		int k = 18;
		
		boolean res = false;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(j!=i) {
					if(arr[i]+arr[j]== k) {
						res = true;
						break;
					}
				}
			}
			if(res==true) {
				break;
			}
		}
		
		System.out.println(res);

	}

}
