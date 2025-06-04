class Solution {
    int lcsOf3(String s1, String s2, String s3) {
        int n = s1.length();
        int m = s2.length();
        int l = s3.length();

        // dp[i][j][k] will hold the length of LCS of
        // s1[0..i-1], s2[0..j-1], s3[0..k-1].
        int[][][] dp = new int[n+1][m+1][l+1];

        // Initialize: dp[i][j][0] = 0, dp[i][0][k] = 0, dp[0][j][k] = 0
        // (by default Java inits arrays to 0, so we don't need to explicitly fill them)

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                for (int k = 1; k <= l; k++) {
                    char c1 = s1.charAt(i - 1);
                    char c2 = s2.charAt(j - 1);
                    char c3 = s3.charAt(k - 1);

                    if (c1 == c2 && c2 == c3) {
                        // All three characters match: extend the subsequence by 1
                        dp[i][j][k] = dp[i - 1][j - 1][k - 1] + 1;
                    } else {
                        // Otherwise, drop one character from one of the strings and take the max
                        dp[i][j][k] = Math.max(
                            Math.max(dp[i - 1][j][k],     // drop s1’s current char
                                     dp[i][j - 1][k]),  // drop s2’s current char
                            dp[i][j][k - 1]               // drop s3’s current char
                        );
                    }
                }
            }
        }

        // The answer is the LCS length of the full strings
        return dp[n][m][l];
    }
}