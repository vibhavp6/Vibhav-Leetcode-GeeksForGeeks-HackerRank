class Solution {
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int MOD = 1_000_000_007;
        int[][][] dp = new int[m][n][maxMove + 1];
        
        for (int[][] layer : dp)
            for (int[] row : layer)
                Arrays.fill(row, -1);

        return countPaths(startRow, startColumn, maxMove, m, n, dp, MOD);
    }

    private int countPaths(int i, int j, int movesLeft, int m, int n, int[][][] dp, int MOD) {
        if (i < 0 || j < 0 || i >= m || j >= n)
            return 1;
        if (movesLeft == 0)
            return 0;
        if (dp[i][j][movesLeft] != -1)
            return dp[i][j][movesLeft];

        int total = 0;
        total = (total + countPaths(i + 1, j, movesLeft - 1, m, n, dp, MOD)) % MOD;
        total = (total + countPaths(i - 1, j, movesLeft - 1, m, n, dp, MOD)) % MOD;
        total = (total + countPaths(i, j + 1, movesLeft - 1, m, n, dp, MOD)) % MOD;
        total = (total + countPaths(i, j - 1, movesLeft - 1, m, n, dp, MOD)) % MOD;

        dp[i][j][movesLeft] = total;
        return total;
    }
}
