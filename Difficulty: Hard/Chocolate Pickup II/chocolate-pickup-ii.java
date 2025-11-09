class Solution {
    public int chocolatePickup(int[][] mat) {
        int n = mat.length;
        int[][][] dp = new int[n][n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                for (int k = 0; k < n; k++)
                    dp[i][j][k] = Integer.MIN_VALUE;

        dp[0][0][0] = mat[0][0] == -1 ? Integer.MIN_VALUE : mat[0][0];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    int l = i + j - k;
                    if (l < 0 || l >= n || mat[i][j] == -1 || mat[k][l] == -1) continue;

                    int val = mat[i][j];
                    if (i != k || j != l) val += mat[k][l];

                    int best = Integer.MIN_VALUE;
                    if (i > 0 && k > 0) best = Math.max(best, dp[i - 1][j][k - 1]);
                    if (i > 0 && l > 0) best = Math.max(best, dp[i - 1][j][k]);
                    if (j > 0 && k > 0) best = Math.max(best, dp[i][j - 1][k - 1]);
                    if (j > 0 && l > 0) best = Math.max(best, dp[i][j - 1][k]);

                    if (best != Integer.MIN_VALUE) dp[i][j][k] = best + val;
                }
            }
        }

        return Math.max(0, dp[n - 1][n - 1][n - 1]);
    }
}