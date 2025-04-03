class Solution {
    private int solve(int[][] matrix, int i, int j , int [][]dp) {
        int n = matrix.length;
        
        if (i >= n) return 0;

        if(dp[i][j] != Integer.MIN_VALUE) return dp[i][j];
        int op1 = solve(matrix, i + 1, j,dp);
        int op2 = Integer.MAX_VALUE;
        int op3 = Integer.MAX_VALUE;

        if (j - 1 >= 0) op2 = solve(matrix, i + 1, j - 1,dp);
        if (j + 1 <= n - 1) op3 = solve(matrix, i + 1, j + 1,dp);

        return dp[i][j] = matrix[i][j] + Math.min(Math.min(op1, op2), op3);
    }

    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int minSum = Integer.MAX_VALUE;
        int [] [] dp = new int [n][n];
        for (int [] row : dp) {
            Arrays.fill(row , Integer.MIN_VALUE);
        }
        for (int j = 0; j < n; j++) {
            minSum = Math.min(minSum, solve(matrix, 0, j , dp));
        }
        return minSum;
    }
}