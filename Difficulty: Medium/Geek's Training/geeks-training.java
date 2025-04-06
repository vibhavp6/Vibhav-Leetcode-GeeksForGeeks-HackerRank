//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            int[][] arr = new int[N][3];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < 3; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            Solution obj = new Solution();
            int res = obj.maximumPoints(arr);
            System.out.println(res);

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java



class Solution {
    public int solve(int[][] arr, int i, int precol, int[][] dp) {
        int n = arr.length;
        int m = arr[0].length;
        if (i >= n) {
            return 0;
        }
        if (dp[i][precol] != -1) {
            return dp[i][precol];
        }
        int maxVal = 0;
        for (int j = 0; j < m; j++) {
            if (j != precol) {
                int current = arr[i][j] + solve(arr, i + 1, j, dp);
                maxVal = Math.max(maxVal, current);
            }
        }
        return dp[i][precol] = maxVal;
    }

    public int maximumPoints(int[][] arr) {
        int n = arr.length;
        if (n == 0) return 0;
        int m = arr[0].length;
        if (m == 0) return 0;
        int[][] dp = new int[n][m];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int ans = 0;
        for (int j = 0; j < m; j++) {
            ans = Math.max(ans, solve(arr, 0, j, dp));
        }
        return ans;
    }
}