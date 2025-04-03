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
    private int solve(int arr[][], int precol, int i, int[][]dp) {
        int n = arr.length;
        int m = arr[0].length;

        if (i == n) return 0; 
        
        if(dp[i][precol] != -1) return dp[i][precol];

        int op1 = Integer.MIN_VALUE;
        int op2 = Integer.MIN_VALUE;
        
        if(precol == 0){
            op1 = arr[i][1] + solve(arr, 1, i + 1,dp);
            op2 = arr[i][2] + solve(arr, 2, i + 1,dp);
        }
        if(precol == 1){
            op1 = arr[i][0] + solve(arr, 0, i + 1,dp);
            op2 = arr[i][2] + solve(arr, 2, i + 1,dp);
        }
        if(precol == 2){
            op1 = arr[i][0] + solve(arr, 0, i + 1,dp);
            op2 = arr[i][1] + solve(arr, 1, i + 1,dp);
        }


        return dp[i][precol] = Math.max(op1, op2);
    }

    public int maximumPoints(int arr[][]) {
        
        int n = arr.length;
        int m = arr[0].length;
         int [] [] dp = new int [n][m];
        for (int [] row : dp) {
            Arrays.fill(row , -1);
        }
        
        int ans = -1;
        
        for(int j = 0; j < 3; j++){
            ans = Math.max(ans, solve(arr, j, 0,dp));
        }
        
        return ans;
    }
}