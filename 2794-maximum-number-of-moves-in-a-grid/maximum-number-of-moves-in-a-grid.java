import java.util.Arrays;

class Solution {
    public int solve(int[][] matrix, int m, int n, int i, int j, int[][] dp) {
        if (j == n - 1) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        
        int maxSteps = 0;
        // Check right direction (same row)
        if (matrix[i][j + 1] > matrix[i][j]) {
            int steps = 1 + solve(matrix, m, n, i, j + 1, dp);
            maxSteps = Math.max(maxSteps, steps);
        }
        // Check up-right direction (i-1)
        if (i - 1 >= 0 && matrix[i - 1][j + 1] > matrix[i][j]) {
            int steps = 1 + solve(matrix, m, n, i - 1, j + 1, dp);
            maxSteps = Math.max(maxSteps, steps);
        }
        // Check down-right direction (i+1)
        if (i + 1 < m && matrix[i + 1][j + 1] > matrix[i][j]) {
            int steps = 1 + solve(matrix, m, n, i + 1, j + 1, dp);
            maxSteps = Math.max(maxSteps, steps);
        }
        
        dp[i][j] = maxSteps;
        return dp[i][j];
    }
    
    public int maxMoves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int maxMoves = 0;
        for (int k = 0; k < m; k++) {
            maxMoves = Math.max(maxMoves, solve(grid, m, n, k, 0, dp));
        }
        return maxMoves;
    }
}