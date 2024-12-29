class Solution {
    public int numWays(String[] words, String target) {
        int n = words.length;
        int m = words[0].length();
        int mod = 1_000_000_007;
        int[][] A = new int[m][26];
        for (String word : words) {
            for (int j = 0; j < m; j++) {
                A[j][word.charAt(j) - 'a']++;
            }
        }
        int[][] dp = new int[m][target.length()];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return F(0, 0, target, A, dp, mod);
    }
    public int F(int i, int j, String target, int[][] A, int[][] dp, int mod) {
        if (j == target.length()) {
            return 1;
        }
        if (i == A.length) {
            return 0; 
        }
        if (dp[i][j] != -1) {
            return dp[i][j]; 
        }
        long count = F(i + 1, j, target, A, dp, mod); 
        count %= mod;
        count += (1L * A[i][target.charAt(j) - 'a'] * F(i + 1, j + 1, target, A, dp, mod)) % mod;
        count %= mod;
        return dp[i][j] = (int) count;
    }
}