import java.util.Arrays;

class Solution {
    int[][] dp;

    private int solve(int n, int m, int i, int j) {
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        if (i >= n || j >= m) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        dp[i][j] = solve(n, m, i + 1, j) + solve(n, m, i, j + 1);
        return dp[i][j];
    }

    public int uniquePaths(int m, int n) {
        dp = new int[n][m];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(n, m, 0, 0);
    }
}