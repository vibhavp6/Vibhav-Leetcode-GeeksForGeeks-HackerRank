class Solution {
    public int uniquePaths(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        // Edge case: if start is blocked
        if (grid[0][0] == 1) return 0;

        int[][] dp = new int[n][m];
        for (int[] row : dp) {
            java.util.Arrays.fill(row, -1);
        }

        return dfs(n - 1, m - 1, grid, dp);
    }

    private int dfs(int r, int c, int[][] grid, int[][] dp) {
        if (r < 0 || c < 0 || grid[r][c] == 1) return 0;
        if (r == 0 && c == 0) return 1;

        if (dp[r][c] != -1) return dp[r][c];

        int up = dfs(r - 1, c, grid, dp);
        int left = dfs(r, c - 1, grid, dp);

        return dp[r][c] = up + left;
    }
}

