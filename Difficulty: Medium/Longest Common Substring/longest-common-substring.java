//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S1 = read.readLine().trim();
            String S2 = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestCommonSubstr(S1, S2));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestCommonSubstr(String str1, String str2) {
        int n=str1.length();
    	int m=str2.length();
    	int dp[][]=new int[n+1][m+1];
    	int omax=0;
    	
    	for(int i=1;i<dp.length;i++) {
    		for(int j=1;j<dp[0].length;j++) {
    			if(str1.charAt(i-1)==str2.charAt(j-1)) {
    				dp[i][j]=1+dp[i-1][j-1];
    				omax=Math.max(omax, dp[i][j]);
    			}else {
    				dp[i][j]=0;
    			}
    		}
    	}
    	return omax;
    }
}