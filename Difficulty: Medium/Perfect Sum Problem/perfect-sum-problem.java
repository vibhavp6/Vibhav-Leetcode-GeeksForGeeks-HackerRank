//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim()); // Read number of test cases

        // Loop for each test case
        while (t-- > 0) {
            String line = read.readLine().trim(); // Read the array input
            String[] numsStr = line.split(" ");   // Split the input string by spaces
            int[] nums =
                new int[numsStr.length]; // Convert string array to integer array
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            int target = Integer.parseInt(read.readLine().trim()); // Read target sum

            Solution ob = new Solution(); // Create an object of Solution class
            System.out.println(
                ob.perfectSum(nums, target)); // Call perfectSum and print the result
            System.out.println("~");          // Call perfectSum and print the result
        }
    }
}
// } Driver Code Ends



class Solution {
    static int[][] dp;

    static int solve(int[] arr, int sum, int idx) {
        if(idx == arr.length) {
            return sum == 0 ? 1 : 0;
        }
        if (idx >= arr.length || sum < 0) return 0;
        if (dp[idx][sum] != -1) return dp[idx][sum];

        int take = solve(arr, sum - arr[idx], idx + 1);
        int notTake = solve(arr, sum, idx + 1);

        dp[idx][sum] = take + notTake;
        return dp[idx][sum];
    }

    static int perfectSum(int nums[], int target) {
        int n = nums.length;
        dp = new int[n][target + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(nums, target, 0); 
    }
}
