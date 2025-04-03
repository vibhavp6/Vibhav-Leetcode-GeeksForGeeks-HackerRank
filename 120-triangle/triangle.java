class Solution {

    public int solve(List<List<Integer>> triangle , int i , int j, int [][]dp){
         int n = triangle.size();

        if (i == n) return 0;

        if (dp[i][j] != Integer.MAX_VALUE) return dp[i][j];
        int op1= triangle.get(i).get(j) + solve (triangle, i+1 , j ,dp);
        int op2= triangle.get(i).get(j) + solve (triangle, i+1 , j+1 ,dp);
        return dp[i][j] = Math.min(op1 , op2);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int [][]dp = new int [n][n];
        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        return solve(triangle , 0, 0 , dp);

    }
}