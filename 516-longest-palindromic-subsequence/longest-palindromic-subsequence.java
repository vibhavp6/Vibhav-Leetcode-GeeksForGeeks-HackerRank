class Solution {

    public int solveMemo(String a, String b, int i, int j, int[][] dp) {
        // Base case
        if (i >= a.length() || j >= b.length()) {
            return 0;
        }

        // If already calculated
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int ans = 0;
        if (a.charAt(i) == b.charAt(j)) {
            ans = 1 + solveMemo(a, b, i + 1, j + 1, dp);
        } else {
            ans = Math.max(solveMemo(a, b, i + 1, j, dp), solveMemo(a, b, i, j + 1, dp));
        }

        dp[i][j] = ans;
        return ans;
    }

    public int longestPalindromeSubseq(String s) {
        String revStr = new StringBuilder(s).reverse().toString();
        int[][] dp = new int[s.length()][s.length()];
        
        // Initialize dp with -1
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                dp[i][j] = -1;
            }
        }

        return solveMemo(s, revStr, 0, 0, dp);
    }
}
