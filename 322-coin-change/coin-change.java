class Solution {
    int dp [];
    int solve(int[] coins, int amount ){
        int n  = coins.length;
        if(amount == 0) return 0;
        if(amount < 0) return Integer.MAX_VALUE;
        if(dp[amount] != -1) return dp[amount];

        int op = Integer.MAX_VALUE;

        for(int i = 0; i < coins.length; i++){
            int tmp = solve(coins, amount - coins[i]);

            if(tmp != Integer.MAX_VALUE){
                op = Math.min(op, tmp + 1);
            }
        }

        return dp[amount] = op;
    }
    public int coinChange(int[] coins, int amount) {
        dp = new int[amount+1];
        Arrays.fill(dp, -1);
        int ans =  solve(coins, amount );

        if(ans == Integer.MAX_VALUE) return -1;

        return ans;
    }
}