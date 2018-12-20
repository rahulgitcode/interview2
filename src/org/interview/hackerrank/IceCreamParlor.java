package org.interview.hackerrank;

import java.util.Scanner;

public class IceCreamParlor {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int m = in.nextInt();
            int n = in.nextInt();
            int a[] = new int[n];
            
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            
            boolean done = false;
            for(int i=0; i< a.length; i++){
                for(int j=0; j< a.length; j++){
                    if(i!=j && (a[i]+a[j] == m)){
                        int x = i+1;
                        int y = j+1;
                        System.out.println(x +" "+ y);
                        done = true;
                        break;
                    }
                }
                if(done){
                    break;
                }
            }
        }
        
    }
}
