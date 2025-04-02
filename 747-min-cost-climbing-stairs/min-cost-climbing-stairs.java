import java.util.Arrays;
class Solution {

     public int helper (int [] cost , int index , int[] dp) {
        if (index >= cost.length) return 0;

        if  (dp[index] != -1) return dp[index];

        int costsone = cost[index] + helper(cost , index +1, dp);
        int costtwo = cost[index] + helper(cost , index+2, dp);

        return dp[index] = Math.min(costsone , costtwo);
    } 

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];  
        Arrays.fill(dp, -1);
        return Math.min(helper(cost, 0,dp), helper( cost,1, dp));
    }
}