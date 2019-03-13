package org.interview.hackerrank;

public class CommonChild {
	
	public static int commonChild(String s1, String s2) {
        int[] sequence = new int[s1.length()];
        
        char[] arr = s1.toCharArray();
        for(int i=0; i<s1.length(); i++){
            char ch = s1.charAt(i);

            if(s1.indexOf(ch)!=-1){
            	sequence[i] = s2.indexOf(ch);
            }//[3, 1, -1, 2, -1, 0]
        }
        
        
        int count =0;
        int maxcount = count;
        int prev=sequence[0] ;
        for(int i=0; i< sequence.length-1; i++) {
        	if(sequence[i]!=-1) {
        		prev = sequence[i];
        	}
        	        	
        	if(sequence[i+1]!=-1 && prev!=-1 && sequence[i+1]>prev) {
        		prev = sequence[i+1];
        		count++;
        	}else {
        		if(count>maxcount)
        			maxcount =count;
        		count=0;
        	}
        }
        
        if(count>maxcount)
        	maxcount = count;
        
        if(maxcount==0)
        	return maxcount;
        			
        return maxcount+1;

    }
	
	
	public static void main(String[] args) {
		String s1 = "WEWOUCUIDGCGTRMEZEPXZFEJWISRSBBSYXAYDFEJJDLEBVHHKS";
		String s2 = "FDAGCXGKCTKWNECHMRXZWMLRYUCOCZHJRRJBOAJOQJZZVUYXIC";
		
		System.out.println(commonChild(s1,s2));
		
	}

}
