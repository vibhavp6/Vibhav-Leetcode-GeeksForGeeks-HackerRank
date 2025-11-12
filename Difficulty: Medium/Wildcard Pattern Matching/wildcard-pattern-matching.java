class Solution {
    public boolean wildCard(String txt, String pat) {
        // code here
        int n = txt.length();
        int m = pat.length();
        
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;
       
        for (int i = 1; i <= m; i++) {
            if (pat.charAt(i - 1) == '*') {
                dp[i][0] =dp[i - 1][0];
            } else {
                dp[i][0] =false;
            }
        }
 
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                char pChar = pat.charAt(i - 1);
                char tChar = txt.charAt(j - 1);
                if (pChar == '?') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (pChar == '*') {
                 
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                } else {
                    if (pChar == tChar) {
                        dp[i][j] = dp[i - 1][j - 1];
                    } else {
                        dp[i][j] = false;
                    }
                }
            }
        }
        return dp[m][n];
    }
}