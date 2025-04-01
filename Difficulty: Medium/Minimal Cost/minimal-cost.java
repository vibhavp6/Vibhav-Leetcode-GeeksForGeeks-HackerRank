//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends

// User function Template for Java

import java.util.Arrays;

class Solution {
    private int solve(int index, int k, int[] arr, int[] dp) {
        if (index == arr.length - 1) return 0;  // Base case
        if (dp[index] != -1) return dp[index];  // Memoization check

        int minCost = Integer.MAX_VALUE;
        
        // Try all jumps from 1 to k
        for (int j = 1; j <= k && index + j < arr.length; j++) {
            int jumpCost = Math.abs(arr[index] - arr[index + j]) + solve(index + j, k, arr, dp);
            minCost = Math.min(minCost, jumpCost);
        }

        return dp[index] = minCost;  // Store and return the result
    }

    public int minimizeCost(int k, int arr[]) {
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return solve(0, k, arr, dp);
    }
}



//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution obj = new Solution();
            int res = obj.minimizeCost(k, arr);

            System.out.println(res);

            System.out.println("~");
        }
    }
}
// } Driver Code Ends