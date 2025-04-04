//{ Driver Code Starts
import java.io.*;
import java.util.*;

class RodCutting {

    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0) {
            String s[] = in.readLine().trim().split(" ");
            int[] arr = new int[s.length];
            for (int i = 0; i < s.length; i++) arr[i] = Integer.parseInt(s[i]);

            Solution ob = new Solution();
            out.println(ob.cutRod(arr));

            out.println("~");
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution {
    int[] dp;

    int solve(int[] price, int targetLen) {
        if (targetLen == 0) return 0;
        
        if (dp[targetLen] != -1) return dp[targetLen];

        int maxProfit = 0;

        // Try all cut lengths from 1 to targetLen
        for (int i = 1; i <= targetLen; i++) {

            if (i <= targetLen) {
                int profit = price[i - 1] + solve(price, targetLen - i);
                
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return dp[targetLen] = maxProfit;
    }

    public int cutRod(int[] price) {
        int n = price.length;
        dp = new int[n + 1];
        Arrays.fill(dp, -1);

        return solve(price, n);
    }
}