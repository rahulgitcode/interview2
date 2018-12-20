package org.interview.datastructures;

import java.util.Arrays;
import java.util.Comparator;

public class StringsTwo {
	
	public static void main(String[] args){
		
		String str = "welcometojava";
		String[] arr = new String[100];
		int j = 0;
		
		for(int i = 0; i<str.length()-2;){
			arr[j] = str.substring(i, i+3);
			i++;
			j++;
		}
		
		for(int k=0; k<arr.length;k++){
			if(arr[k]!=null){
				//System.out.println(arr[k]);
			}
			
		}
		
		Arrays.sort(arr, new Comparator<String>() {
	        @Override
	        public int compare(String o1, String o2) {
	            if (o1 == null && o2 == null) {
	                return 0;
	            }
	            if (o1 == null) {
	                return 1;
	            }
	            if (o2 == null) {
	                return -1;
	            }
	            return o1.compareTo(o2);
	        }});
		
		for(int k=0; k<arr.length;k++){
			if(arr[k]!=null){
				System.out.println(arr[k]);
			}
			
		}
		
		
	}

}
