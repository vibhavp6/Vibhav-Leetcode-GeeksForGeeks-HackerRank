class Solution {
    public int solve (int m , int n , int i , int j , int [] []dp) {
        if (i >=m || j>= n) return 0;
        if (i == m-1 || j == n-1) return 1;
        if (i == m-1 && j == n-1) return 0;
        if(dp [i][j] != -1) return dp[i][j];
        return dp[i][j] = solve(m , n , i+1 , j, dp) + solve(m, n , i , j+1 , dp);
    }
    public int uniquePaths(int m, int n) {
        int [][]dp  = new int [m][n];
        for(int [] row : dp) {
            Arrays.fill(row , -1);
        }
        return solve(m, n , 0 , 0 ,dp);
    }
}