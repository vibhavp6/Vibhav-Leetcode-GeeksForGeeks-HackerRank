class Solution {
    public int solve(int [][] matrix , int n  , int i , int j , int [][] dp) {
        if(i == n-1) return matrix[i][j]; // ✅ Base case
        if(i >=  n) return Integer.MAX_VALUE;
        if(dp[i][j] != Integer.MAX_VALUE) return dp[i][j];

        int op1 = matrix[i][j] + solve(matrix , n, i+1, j, dp);
        int op2 = Integer.MAX_VALUE;
        int op3 = Integer.MAX_VALUE;

        if(j-1 >= 0) op2 = matrix[i][j] + solve(matrix , n , i+1, j-1, dp);
        if(j+1 < n) op3 = matrix[i][j] + solve(matrix , n, i+1 , j+1 , dp); // ✅ `j+1 < n` likhna sahi hai

        return dp[i][j] =  Math.min(op1, Math.min(op2,op3));
    }

    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int minSum = Integer.MAX_VALUE; // ✅ sahi variable naam
        int [][] dp = new int [n][n];

        for (int [] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        for (int j = 0; j < n; j++) { 
            minSum = Math.min(minSum, solve(matrix, n,0, j , dp)); // ✅ Loop ke andar return nahi ho raha
        }

        return minSum; // ✅ Loop ke baad return
    }
}
