package org.interview.dynamicprogramming;

public class LengthOfLCS {

	public static void main(String[] args) {
		
		String a = "AGGTAB";
		String b = "GXTXAYB";
		
		char[] X = a.toCharArray();
		char[] Y = b.toCharArray();
		
		int m = X.length;
		int n = Y.length;
		
		int res = LCS(X,Y,m,n);
		
		System.out.println(res);

	}

	private static int LCS(char[] a, char[] b, int m, int n) {
		int[][] L = new  int[m+1][n+1];
		
		for(int i=0; i<=m; i++){
			for(int j=0; j<=n; j++){
				
				if(i==0 || j==0){
					L[i][j] = 0;
				}else if(a[i-1]==b[j-1]){
					L[i][j] = 1+ L[i-1][j-1];
				}else{
					L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
				}
			}
		}
		return L[m][n];
	}

}
