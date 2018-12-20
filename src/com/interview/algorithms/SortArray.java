package com.interview.algorithms;

import java.util.Arrays;

/*
 * Sort an array which contain 1 to n values
You have given an array which contain 1 to n element, your task is to sort this array in an efficient way and without replace with 1 to n numbers.

https://www.geeksforgeeks.org/sort-array-contain-1-n-values/

Solution:
Replace element with its position. It will take O(n) time.

 */
public class SortArray {
	static int[] arr = {18,2,1,4,3,7,32,6,5,9,10,17};
	
	public static void main(String[] args) {
		int max = findmax(arr);
		//int[] arr2 = new int[max];
		arr = Arrays.copyOf(arr, max);
		int length = arr.length;
		
		sort(arr,length);
		sort(arr,length);//--Have to to 2 runs = 2xO(n) - still it takes order or n time
		
		for(int i=0; i<arr.length; i++){
			if(arr[i]!=0)
			System.out.println(arr[i]);
		}
		

	}

	private static int findmax(int[] arr) {
		int max = arr[0];
		for(int i=1; i<arr.length; i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		return max;
	}

	private static void sort(int[] arr, int length) {
		for(int i=0; i<length; i++){
			if(arr[i]!=0)
			swap(i, arr[i]-1);
		}
		
	}

	private static void swap(int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
