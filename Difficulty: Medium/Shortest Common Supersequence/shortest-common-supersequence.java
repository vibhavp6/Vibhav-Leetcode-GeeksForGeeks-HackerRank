class Solution {
    public static int minSuperSeq(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        
        int [][]dp = new int [n + 1][m + 1];
        
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if(s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        //dp[n][m] + (n - dp[n][m]) + (m - dp[n][m]); you can simplify the equation
        int result = n + m - dp[n][m];//finally simplified
        
        return result;
    }
}