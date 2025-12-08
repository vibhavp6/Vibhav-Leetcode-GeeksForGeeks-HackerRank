class Solution {
    static String matrixChainOrder(int arr[]) {
        int n = arr.length;
        
        int[][] dp = new int[n][n];
        int[][] split = new int[n][n];

        for (int len = 2; len < n; len++) {
            for (int i = 1; i + len - 1 < n; i++) {
                int j = i + len - 1;
                dp[i][j] = Integer.MAX_VALUE;

                for (int k = i; k < j; k++) {
                    int cost = dp[i][k] + dp[k + 1][j]
                               + arr[i - 1] * arr[k] * arr[j];

                    if (cost < dp[i][j]) {
                        dp[i][j] = cost;
                        split[i][j] = k;
                    }
                }
            }
        }

        return build(1, n - 1, split, new char[]{'A'});
    }

    static String build(int i, int j, int[][] split, char[] name) {
        if (i == j) {
            return String.valueOf(name[0]++);
        }
        int k = split[i][j];
        return "(" + build(i, k, split, name)
                   + build(k + 1, j, split, name) + ")";
    }
}