package com.hmsy.dailycodingchallenge;

/**
 * 
 * This problem was asked by Airbnb.

Given a list of integers, write a function that returns the largest sum of non-adjacent numbers. Numbers can be 0 or negative.

For example, [2, 4, 6, 2, 5] should return 13, since we pick 2, 6, and 5. [5, 1, 1, 5] should return 10, since we pick 5 and 5.

Follow-up: Can you do this in O(N) time and constant space?
 * 
 * @author e005391
 *
 */
public class MaxSumOfNonAdjacentNumbers {
	
	public static void main(String[] args) {
		//int[] arr = {1,3,5,7,8,9};
		//int[] arr = {2,4,6,2,5};
		//int[] arr = {5,1,1,5};
		int[] arr = {-1,3,5,2,-2,0,6,7,8};
		
		int incl = arr[0];
		int excl = 0;
		for(int i=1; i<arr.length; i++) {
			int temp = incl;
			incl = Math.max(arr[i]+excl, incl);
			excl = temp;
		}
		
		int res = Math.max(incl, excl);
		System.out.println(res);
	}

}
