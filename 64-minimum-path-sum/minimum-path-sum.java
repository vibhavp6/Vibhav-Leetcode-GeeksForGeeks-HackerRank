class Solution {
    public int solve(int [][] grid , int m , int n  ,int i , int j,  int [][] dp) {
        if(i >= m || j >= n) return Integer.MAX_VALUE; ;
        if(i == m-1 && j == n-1) return grid[i][j];
        if (dp [i][j] != -1) return dp [i][j];
        long op1 = grid[i][j] + (long)solve(grid , m , n , i, j+1 , dp) ;
        long op2 = grid[i][j] + (long)solve(grid , m , n , i+1, j , dp) ;
        return dp[i][j] = (int)Math.min(op1 , op2);
    }
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int [][] dp = new int [m][n];
        for (int [] row : dp) {
            Arrays.fill(row , -1);
        }
        return solve(grid ,m , n , 0 , 0 , dp );
    }
}