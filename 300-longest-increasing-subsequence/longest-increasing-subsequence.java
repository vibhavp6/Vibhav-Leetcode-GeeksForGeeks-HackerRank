public class Solution {
    public static int lengthOfLIS(int[] a) {
        int n = a.length;
        int[][] dp = new int[n][n + 1];
        for (int[] row : dp)
            Arrays.fill(row, -1);
        return solveMem(n, a, 0, -1, dp);
    }

    private static int solveMem(int n, int[] a, int curr, int prev, int[][] dp) {
        if (curr == n)
            return 0;

        if (dp[curr][prev + 1] != -1)
            return dp[curr][prev + 1];

        int take = 0;
        if (prev == -1 || a[curr] > a[prev]) {
            take = 1 + solveMem(n, a, curr + 1, curr, dp);
        }

        int notTake = solveMem(n, a, curr + 1, prev, dp);

        dp[curr][prev + 1] = Math.max(take, notTake);
        return dp[curr][prev + 1];
    }
}
