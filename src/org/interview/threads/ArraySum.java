package org.interview.threads;

public class ArraySum {

	private int sum;
	
	synchronized public void sum(int[] arr){
		for(int i=0; i<arr.length; i++){
			sum+=arr[i];
			System.out.println("Running total for thread -"+ Thread.currentThread().getName()+ " is = "+ sum);
		}
	}
}
