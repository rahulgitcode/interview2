package org.interview.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxLexoSubString {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int k = input.nextInt();
        
        //int length = str.length()/k;
        //System.out.println(length);
        String[] arr = new String[11];
        int max = str.length()-k;
        System.out.println(max);
        
        for(int i=0; i<=max; i++){
            int j = i+k;
            String val = str.substring(i,j);
            System.out.println(val);
            arr[i]=val;
        }
        
        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[10]);
        
    }

}
