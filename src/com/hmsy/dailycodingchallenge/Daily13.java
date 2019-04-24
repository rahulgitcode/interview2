package com.hmsy.dailycodingchallenge;

public class Daily13 {
	public static void main(String[] args) {
		int[][] cost = {{17,2,17},
						{16,16,5},
					   //18,33,7 -> cost[1][x]
						{14,3,19}};
					   //21,10,37 -> cost[2][x]= Finally take the smallest value here
		
		int minCost = findMinCostOfPainting(cost);
		System.out.println("The min cost is :"+ minCost);
		
	}

	private static int findMinCostOfPainting(int[][] cost) {
		if(cost==null || cost.length==0) {
			return 0;
		}
		System.out.println(cost.length);
		for(int i=1; i<cost.length; i++) {
			cost[i][0] += Math.min(cost[i-1][1], cost[i-1][2]);
			cost[i][1] += Math.min(cost[i-1][0], cost[i-1][2]);
			cost[i][2] += Math.min(cost[i-1][0], cost[i-1][1]);
		}
		return Math.min(Math.min(cost[cost.length-1][0], cost[cost.length-1][1]), 
				cost[cost.length-1][2]);
	}

}
