class Solution {
    public int solve(int[] days, int[] costs, int index, int[] dp) {
        if (index >= days.length) return 0;
        if (dp[index] != -1) return dp[index];

        int oneday = costs[0] + solve(days, costs, index + 1, dp);

        int sevvenday = Integer.MAX_VALUE;
        for (int j = index; j < days.length && days[j] < days[index] + 7; j++) {
            sevvenday = costs[1] + solve(days, costs, j + 1, dp);
        }

        int thiday = Integer.MAX_VALUE;
        for (int j = index; j < days.length && days[j] < days[index] + 30; j++) {
            thiday = costs[2] + solve(days, costs, j + 1, dp);
        }

        dp[index] = Math.min(oneday, Math.min(sevvenday, thiday));
        return dp[index];
    }

    public int mincostTickets(int[] days, int[] costs) {
        int[] dp = new int[days.length];
        Arrays.fill(dp, -1); 
        return solve(days, costs, 0, dp);
    }
}
