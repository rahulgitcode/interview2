package org.interview.hackerrank;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SherlockValidString {

	public static void main(String[] args) throws IOException {

		String s = new String(Files.readAllBytes(Paths.get("C:\\\\Users\\\\e005391\\\\Desktop\\\\input13.txt")));
		System.out.println(isValid(s));

	}
	public static String isValid(String s) {
        char[] arr = s.toCharArray();
        Map<Character,Integer> freq = new HashMap<Character,Integer>();

        for(int i=0; i<arr.length; i++){
            Character ch = arr[i];
            if(freq.containsKey(ch)){
                int c = freq.get(ch);
                freq.put(ch, c+1);
            }else{
                freq.put(ch, 1);
            }
        }

        Set<Character> keyset = freq.keySet();
        
        Map<Integer,Integer> freqCount = new HashMap<Integer,Integer>();
        for(Character key : keyset){
            int cc = freq.get(key);
            if(freqCount.containsKey(cc)){
                int v = freqCount.get(cc);
                freqCount.put(cc, v+1);
            }else{
                freqCount.put(cc,1);
            }
        }

        Set<Integer> valset = freqCount.keySet();
        if(valset.size()==1) {
        	return "YES";
        }else if(valset.size()>2){
            return "NO";
        }
        
        
        int[] vals = new int[2];
        int k=0;
        for(Integer i : valset){
            vals[k] = i;
            k++;
        }
        
        if((vals[0]==1 && freqCount.get(vals[0])==1)|| (vals[1]==1 && freqCount.get(vals[1])==1)) {
        	return "YES";
        }else if(vals[0]>vals[1]){
            if(vals[0]-vals[1]>1){
                return "NO";
            }else{
                if(freqCount.get(vals[0]) == 1){
                    return "YES";
                }else{
                    return "NO";
                }
            }
        }else if(vals[1] > vals[0]){
            if (vals[1] - vals[0] > 1) {
                return "NO";
            } else {
                if (freqCount.get(vals[1]) == 1) {
                    return "YES";
                } else {
                    return "NO";
                }
            }
        }

        return "NO";
    }

}
