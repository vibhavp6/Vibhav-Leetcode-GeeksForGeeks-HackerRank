//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s[] = read.readLine().split(" ");
            int N = Integer.parseInt(s[0]);
            int M = Integer.parseInt(s[1]);
            int A[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                String S[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) {
                    A[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution ob = new Solution();
            System.out.println(ob.sumOfRowCol(N, M, A));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int sumOfRowCol(int N, int M, int A[][]) {
        // code here
        int min = Math.min(N,M);
        for (int i = 0; i< min; i++) {
            int sum = 0;
            int sum2  =0 ;
            
            for (int j = 0; j<M; j++) {
                sum += A[i][j];
            }
            
            for (int j = 0; j < N; j++) {
                sum2 += A[j][i];
            }
            
            if (sum != sum2) return 0;
        }
        
        
        return 1;
    }
}