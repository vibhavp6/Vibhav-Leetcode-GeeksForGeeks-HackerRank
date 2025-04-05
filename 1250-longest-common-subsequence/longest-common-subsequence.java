class Solution {

    public int solve(String a, String b, int i, int j, int[][] dp) {
        // Base case
        if (i == a.length()) return 0;
        if (j == b.length()) return 0;

        if (dp[i][j] != -1) return dp[i][j];

        int ans = 0;
        if (a.charAt(i) == b.charAt(j)) {
            ans = 1 + solve(a, b, i + 1, j + 1, dp);
        } else {
            ans = Math.max(solve(a, b, i + 1, j, dp), solve(a, b, i, j + 1, dp));
        }

        dp[i][j] = ans;
        return ans;
    }

    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];
        for (int i = 0; i < text1.length(); i++) {
            for (int j = 0; j < text2.length(); j++) {
                dp[i][j] = -1;
            }
        }
        return solve(text1, text2, 0, 0, dp);
    }
}
