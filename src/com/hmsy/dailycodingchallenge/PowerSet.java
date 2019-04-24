package com.hmsy.dailycodingchallenge;

public class PowerSet {

	public static void main(String[] args) {
		char[] set = {'a','b','c'};
		printPowerSet(set);

	}

	private static void printPowerSet(char[] set) {
		int setsize = set.length;
		long powersetlen = (long) Math.pow(2,setsize);
		
		for(int i=0; i<powersetlen; i++) {
			
			for(int j=0; j<setsize; j++) {
				/*System.out.println("i="+i);
				System.out.println("j="+j);
				System.out.println("calc="+ (i & (1<<j)));*/
				if((i & (1<<j)) > 0) {
					System.out.println(set[j]);
				}
			}
			System.out.println();
			
		}
	}

}
