class Solution {
    public int minFallingPathSum(int[][] grid) {
        int n = grid.length, res = Integer.MAX_VALUE;
        int[][] dp = new int[n][n];
        for(int row[] : dp) {
            Arrays.fill(row, -1);
        }

        for(int j = 0; j < n; ++j) {
            dp[0][j] = grid[0][j];
        }

        for(int i = 1; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                int temp = Integer.MAX_VALUE;

                for(int k = 0; k < n; ++k) {
                    if(j != k) {
                        temp = Math.min(temp, grid[i][j] + dp[i - 1][k]);
                    }

                    dp[i][j] = temp;
                }
            }
        }

        for(int j = 0; j < n; ++j) {
            res = Math.min(res, dp[n - 1][j]);
        }

        return res;
    }
}