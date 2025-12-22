class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs[0].length(), m = strs.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (isValid(strs, j, i)) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int max = 0;
        for (int val : dp) max = Math.max(max, val);
        return n - max;
    }

    private boolean isValid(String[] strs, int j, int i) {
        for (String s : strs) {
            if (s.charAt(j) > s.charAt(i)) return false;
        }
        return true;
    }
}