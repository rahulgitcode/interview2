package org.interview.datastructures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LinkListOne {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();

        int max = 0;
        int curr = 0;
        
	    Map<Integer, Integer> map = new HashMap<>();

	    for (int i = 0; i < n; i++) {
	        int num = in.nextInt();
	        if (deque.size() == m) {
	            int last = (int) deque.pollLast();
	            int val = map.get(last) - 1;
	            map.put(last, val);
	            if (val == 0) {
	                --curr;
	            }
	        }
	        if (!map.containsKey(num) || map.get(num) == 0) {
	            ++curr;
	        }
	        deque.offerFirst(num);
	        max = Math.max(max, curr);

	        // add to map
	        Integer val = map.get(num);
	        if (val == null) val = new Integer(0);
	        map.put(num, val+1);
	    }
		
	}
	
	
	

}
