import java.util.Arrays;

class Solution {
    int[][] dp;

    private int solve(int[][] grid , int n, int m, int i, int j) {
        if (i >= n || j >= m) {
            return 0;
        }
        if (grid [i][j] == 1) return 0;
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        if (grid [i][j] == 1) return 0;

        dp[i][j] = solve(grid , n, m, i + 1, j) + solve(grid , n, m, i, j + 1);
        return dp[i][j];
    }

    public int uniquePathsWithObstacles(int [] [] grid) {
        int n = grid.length;
        int m = grid[0].length;
        dp = new int[n][m];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(grid ,n, m, 0, 0);
    }
}