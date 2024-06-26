//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] matrix = new int[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().split(" ");
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution ob = new Solution();
            int ans = ob.findCoverage(matrix);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int m;
    static int n;
    public static boolean check(int rows,int col,int[][]matrix){
        if(rows<m && rows>=0 && col<n && col>=0 && matrix[rows][col]==1) return true;
        return false;
        
    }
    public int findCoverage(int[][] matrix) {
        // code here
        m=matrix.length;
        n=matrix[0].length;
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    if(check(i+1,j,matrix))count++;//down
                    if(check(i-1,j,matrix))count++;//top
                    if(check(i,j+1,matrix))count++;//right
                    if(check(i,j-1,matrix))count++;//left
                    
                    
                }
            }
        }
        return count;
    }
}