import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionDecimalToBinary {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        StringBuffer buff = new StringBuffer();
        
        while(n!=0){
            int rem;
            
            rem = n%2;
            buff.append(String.valueOf(rem));
            n=n/2;
        }
        
        //System.out.println(buff.reverse().toString());
        String binary = buff.reverse().toString();
        int count =0;
        int maxCount =0;
        String prev ="0";
        for(int i=0;i<binary.length();i++){
            if(String.valueOf(binary.charAt(i)).equals("1")){
                if(prev == "0"){
                    
                	count = 1;
                    prev = "1";
                }else if(prev == "1"){
                    count++;
                    prev = "1";
                }
            }else if(String.valueOf(binary.charAt(i)).equals("0")){
                prev = "0";
                if(count > maxCount){
                	maxCount = count;
                }
            }
        }
        
        System.out.println(maxCount);
    }
}
