//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String[] str = br.readLine().trim().split(" ");
            int n = str.length;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            Solution sln = new Solution();
            int res = sln.minCostClimbingStairs(arr);
            System.out.println(res);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


//Back-end complete function Template for Java

class Solution {
    static int minCostClimbingStairs(int[] cost) {
        if(cost==null||cost.length==0)
        return 0;
        
        int n = cost.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return Math.min(minCostClimbingStairsUtils(cost,n-1,dp),
        minCostClimbingStairsUtils(cost,n-2,dp));
    }
    private static int minCostClimbingStairsUtils(int[] cost,int idx,int[] dp)
    {
        if(idx<0)
        return 0;
        if(idx==0)
        return cost[idx];
        
        if(dp[idx] != -1)
        return dp[idx];
        
        return dp[idx] = cost[idx]+Math.min(minCostClimbingStairsUtils(cost,idx-1,dp),
        minCostClimbingStairsUtils(cost,idx-2,dp));
    }
};