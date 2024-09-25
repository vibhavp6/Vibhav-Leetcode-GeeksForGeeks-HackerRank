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
            String[] S = read.readLine().split(" ");
            int N = Integer.parseInt(S[0]);
            int M = Integer.parseInt(S[1]);
            int Grid[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                String[] s = read.readLine().split(" ");
                for (int j = 0; j < M; j++) Grid[i][j] = Integer.parseInt(s[j]);
            }
            Solution ob = new Solution();
            System.out.println(ob.sumOfMatrix(N, M, Grid));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int sumOfMatrix(int N, int M, int[][] Grid) {
        // code here
        int sum = 0;
        for (int i = 0; i<N; i++){
            for (int j =0; j<M; j++) {
                sum += Grid[i][j];
            }
        }
        return sum;
    }
}