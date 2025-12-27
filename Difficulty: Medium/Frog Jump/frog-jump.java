class Solution {

    int[] t;

    int minCostUtil(int[] height, int n) {
        if (n == 0) return 0;
        if (n == 1) return Math.abs(height[1] - height[0]);

        if (t[n] != -1) {
            return t[n];
        }

        int oneStep = minCostUtil(height, n - 1)
                + Math.abs(height[n] - height[n - 1]);

        int twoStep = minCostUtil(height, n - 2)
                + Math.abs(height[n] - height[n - 2]);

        t[n] = Math.min(oneStep, twoStep);
        return t[n];
    }

    int minCost(int[] height) {
        int n = height.length;

        t = new int[n];
        for(int i=0; i<n; i++){
            t[i] = -1;
        }

        return minCostUtil(height, n - 1);
    }
}

