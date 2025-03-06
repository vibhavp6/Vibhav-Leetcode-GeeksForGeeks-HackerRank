//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            String s1 = sc.next(); // Take both the strings as input
            String s2 = sc.next();

            Solution obj = new Solution();

            // Call the lcs function with the lengths of the strings as
            // parameters
            System.out.println(obj.lcs(s1, s2));
            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends

class Solution {
    private static int[][] dp;
    private static int LCS(int i,int j,String s1,String s2){
        if(i==s1.length() || j==s2.length())return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)) return dp[i][j]=1+LCS(i+1,j+1,s1,s2);
        else return dp[i][j]=Math.max(LCS(i+1,j,s1,s2),LCS(i,j+1,s1,s2));
    }
    static int lcs(String s1, String s2) {
        int m=s1.length();
        int n=s2.length();
        dp=new int[m][n];
        for(int[] row:dp) Arrays.fill(row,-1);
        return LCS(0,0,s1,s2);
        
    }
}