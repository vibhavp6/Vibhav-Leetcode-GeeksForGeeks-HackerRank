//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().maxProfit(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public static int maxProfit(int[] arr) {
        // code here
        int k = 2;
        int n = arr.length;
        int [][][] dp = new int[n][2][k + 1];
        for(int i = 0; i < n; i++) 
            for(int j = 0; j < 2; j++) 
                for(int l = 0; l <= k; l++) 
                    dp[i][j][l] = -1;
        return f(0, 1, arr, k, dp);
        
    }
    static int f(int idx, int buy, int arr[], int k, int dp[][][]) {
        if(k < 0) 
            return 0;
        if(idx == arr.length) 
            return 0;
        if(dp[idx][buy][k] != -1) 
            return dp[idx][buy][k];
        int profit = 0;
        if(buy == 1){
            int pick = f(idx + 1, 0, arr, k - 1, dp) - arr[idx];
            int skip = f(idx + 1, 1, arr, k, dp);
            profit = Math.max(pick, skip);
        }
        else{
            int sell = f(idx + 1, 1, arr, k, dp) + arr[idx];
            int skip = f(idx + 1, 0, arr, k, dp);
            profit  = Math.max(sell, skip);
        }
        return dp[idx][buy][k] = profit;
    }
}