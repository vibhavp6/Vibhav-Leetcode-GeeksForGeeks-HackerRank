class Solution {
    public int solve(int index, int buy, int[] prices, int[][] dp) {
        if (index >= prices.length) return 0;

        if (dp[index][buy] != -1) return dp[index][buy];

        int profit = 0;

        if (buy == 1) {
            int buyKaro = -prices[index] + solve(index + 1, 0, prices, dp);
            int skipKaro = 0 + solve(index + 1, 1, prices, dp);
            profit = Math.max(buyKaro, skipKaro);
        } else {
            int sellKaro = prices[index] + solve(index + 1, 1, prices, dp);
            int skipKaro = 0 + solve(index + 1, 0, prices, dp);
            profit = Math.max(sellKaro, skipKaro);
        }

        return dp[index][buy] = profit;
    }

    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][2];

        // Initialize dp with -1
        for (int i = 0; i < n; i++) {
            dp[i][0] = -1;
            dp[i][1] = -1;
        }

        return solve(0, 1, prices, dp);
    }
}
