class Solution {
    public long maxPoints(int[][] points) {
        int m = points.length;
        int n = points[0].length;
        long[] dp = new long[n];

        // Initialize dp with the first row
        for (int j = 0; j < n; ++j) {
            dp[j] = points[0][j];
        }

        // Traverse through each row
        for (int i = 1; i < m; ++i) {
            long[] leftMax = new long[n];
            long[] rightMax = new long[n];
            long[] newDp = new long[n];

            // Calculate left max
            leftMax[0] = dp[0];
            for (int j = 1; j < n; ++j) {
                leftMax[j] = Math.max(leftMax[j - 1], dp[j] + j);
            }

            // Calculate right max
            rightMax[n - 1] = dp[n - 1] - (n - 1);
            for (int j = n - 2; j >= 0; --j) {
                rightMax[j] = Math.max(rightMax[j + 1], dp[j] - j);
            }

            // Calculate new DP for the current row
            for (int j = 0; j < n; ++j) {
                newDp[j] = Math.max(leftMax[j] - j, rightMax[j] + j) + points[i][j];
            }

            dp = newDp;
        }

        long maxPoints = dp[0];
        for (int j = 1; j < n; ++j) {
            maxPoints = Math.max(maxPoints, dp[j]);
        }
        return maxPoints;
    }
}