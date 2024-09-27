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
            int N = Integer.parseInt(read.readLine());
            int Grid[][] = new int[N][N];
            for (int i = 0; i < N; i++) {
                String[] s = read.readLine().split(" ");
                for (int j = 0; j < N; j++) Grid[i][j] = Integer.parseInt(s[j]);
            }
            Solution ob = new Solution();
            System.out.println(ob.diagonalSumDifference(N, Grid));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int diagonalSumDifference(int N, int[][] Grid) {
        // code here
        int i = 0;
        int n = Grid.length;
        int j = n -1;
        int diff = 0;
        int sumss = 0;
        int sum2 = 0;
        while(i<n &&  j >= 0) {
            sumss += Grid[i][i];
            sum2 += Grid[i][j];
            diff = Math.abs(sumss - sum2);
            i++;
            j--;
        }
        
        return diff;
    }
}