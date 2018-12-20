package org.interview.datastructures;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringsThree {
	public static void main(String[] args){
		String pattern = "\\b(\\w+)\\s+\\1\\b";
        Pattern r = Pattern.compile(pattern, 0);

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String input = in.nextLine();
            Matcher m = r.matcher(input);
            boolean findMatch = true;
            while(m.find( )){
                if(m.group().length()!=0){
                	//System.out.println(m.group().trim());
                	//System.out.println(input.replaceAll(m.group(),m.group(1)));
                	input = input.replaceAll(m.group(),m.group(1));
                }
            }
            System.out.println(input);
            testCases--;
        }
	}

}
