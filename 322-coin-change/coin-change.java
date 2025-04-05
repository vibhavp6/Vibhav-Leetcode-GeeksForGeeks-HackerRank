class Solution {
    int[] dp;

    public int coinChange(int[] coins, int amount) {
        dp = new int[amount + 1];
        Arrays.fill(dp, -1);
        int ans = countMinCoins(coins, amount);
        return (ans == Integer.MAX_VALUE) ? -1 : ans;
    }

    private int countMinCoins(int[] coins, int amount) {
        // Base case
        if (amount == 0) return 0;
        if (amount < 0) return Integer.MAX_VALUE;

        if (dp[amount] != -1) return dp[amount];

        int minCoins = Integer.MAX_VALUE;

        for (int coin : coins) {
            int res = countMinCoins(coins, amount - coin);
            if (res != Integer.MAX_VALUE) {
                minCoins = Math.min(minCoins, res + 1);
            }
        }

        return dp[amount] = minCoins;
    }
}
