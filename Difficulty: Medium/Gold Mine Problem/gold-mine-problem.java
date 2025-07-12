class Solution {
    public int maxGold(int mat[][]) {
        int n = mat.length;
        int m = mat[0].length;
        
        int[][] dp = new int[n+1][m+1];
        for(int[] d: dp) Arrays.fill(d, -1);
        int ans = 0;
        for(int i =0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if((i == 0 && j == 0) || j < i) ans = Math.max(ans, func(i, j, mat, dp));
            }
        }
        return ans;
    }
    
    int func(int i, int j, int[][] mat, int[][] dp) {
        if(i < 0 || j >= mat[0].length || i >= mat.length) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        return dp[i][j] = mat[i][j] + Math.max(func(i-1, j+1, mat, dp), Math.max(func(i, j+1, mat, dp), func(i+1, j+1, mat, dp)));
    }
}

