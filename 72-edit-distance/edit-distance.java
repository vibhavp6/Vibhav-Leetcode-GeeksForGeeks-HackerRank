class Solution {

    public int solve(String a, String b, int i, int j, int[][] dp) {
        // Base cases
        if (i == a.length()) return b.length() - j;
        if (j == b.length()) return a.length() - i;

        if (dp[i][j] != -1) return dp[i][j];

        if (a.charAt(i) == b.charAt(j)) {
            dp[i][j] = solve(a, b, i + 1, j + 1, dp);
        } else {
            // insert
            int insertAns = 1 + solve(a, b, i, j + 1, dp);
            // delete
            int deleteAns = 1 + solve(a, b, i + 1, j, dp);
            // replace
            int replaceAns = 1 + solve(a, b, i + 1, j + 1, dp);

            dp[i][j] = Math.min(insertAns, Math.min(deleteAns, replaceAns));
        }

        return dp[i][j];
    }

    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()][word2.length()];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(word1, word2, 0, 0, dp);
    }
}
