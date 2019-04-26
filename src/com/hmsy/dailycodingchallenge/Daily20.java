package com.hmsy.dailycodingchallenge;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * 
 * 
Daily Coding Problem: Problem #20 [Easy]

This problem was asked by Google.

Given two singly linked lists that intersect at some point, find the intersecting node. The lists are non-cyclical.

For example, given A = 3 -> 7 -> 8 -> 10 and B = 99 -> 1 -> 8 -> 10, return the node with value 8.

In this example, assume nodes with the same value are the exact same node objects.

Do this in O(M + N) time (where M and N are the lengths of the lists) and constant space.
 */
public class Daily20 {

	public static void main(String[] args) {
		
		LinkedList list1 = new LinkedList<Integer>();
		LinkedList list2 = new LinkedList<Integer>();
		int intersection=0;
		
		list1.add(3);
		list1.add(4);
		list1.add(6);
		list1.add(9);
		list1.add(13);//intersec point
		list1.add(16);
		list1.add(17);
		
		
		list2.add(5);
		list2.add(8);
		list2.add(12);
		list2.add(13);//intersec point
		list2.add(16);
		list2.add(17);
		
		
		int diff = Math.abs(list1.size() - list2.size());
		
		Iterator itr1 = list1.iterator();
		Iterator itr2 = list2.iterator();
		
		if(diff>0 && list1.size()>list2.size()) {
			for(int i=0; i<diff; i++) {
				itr1.next();
			}
		}else if(diff>0 && list1.size()>list2.size()) {
			for(int i=0; i<diff; i++) {
				itr2.next();
			}
		}
		
		while(itr1.hasNext() && itr2.hasNext()) {
			int item1 = (int) itr1.next();
			int item2 = (int) itr2.next();
			if(item1 == item2) {
				intersection = item1;
				break;
			}
		}
		
		
		System.out.println("Intersection point is : "+ intersection);
		

	}

}
