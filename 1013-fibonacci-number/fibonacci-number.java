import java.util.Arrays;
class Solution {

    private int solve(int n ,int [] dp) {
        if(n==0 || n==1) return n;
        if(dp[n] != -1) return dp[n];

        return dp[n] = solve(n-1,dp) + solve(n-2 , dp);
    }

    public int fib(int n) {
        int [] dp =new int [31];
       Arrays.fill(dp,-1);
       return solve(n, dp);
    }
}