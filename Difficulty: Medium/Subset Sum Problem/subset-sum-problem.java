//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {

            String input_line[] = read.readLine().trim().split("\\s+");
            int N = input_line.length;
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if (ob.isSubsetSum(arr, sum))
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    static int [][] dp;
    static Boolean solve(int [] arr  , int sum , int idx) {
        if(sum == 0) return true;
        if(idx>= arr.length || sum <0) return false;
        if(dp[idx][sum] != -1) return dp[idx][sum] == 1;

        boolean take = solve(arr , (sum-arr[idx]) , idx+1);
        boolean nottake = solve(arr , sum , idx+1);
        dp[idx][sum] = (take || nottake) ? 1 : 0;
        return take || nottake;

        
    }

    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        int n = arr.length;

        dp = new int [n][sum+1];
        for(int [] row : dp) {
            Arrays.fill(row , -1);
        }
        return solve(arr , sum , 0);
    }
}