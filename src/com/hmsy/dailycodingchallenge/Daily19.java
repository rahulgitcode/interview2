package com.hmsy.dailycodingchallenge;

/*
 * 
Daily Coding Problem: Problem #19 [Medium]

This problem was asked by Facebook.

A builder is looking to build a row of N houses that can be of K different colors. He has a goal of minimizing cost while ensuring that no two neighboring houses are of the same color.

Given an N by K matrix where the nth row and kth column represents the cost to build the nth house with kth color, return the minimum cost which achieves this goal.
 */

public class Daily19 {
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
