class Solution {
    int minCost(int[][] costs) {
        int n = costs.length;
        if (n == 0) return 0;
        
        int k = costs[0].length;
        if (k == 0) return -1;

        // If only 1 color but more than 1 wall → impossible
        if (k == 1 && n > 1) return -1;

        // Track minimum and second minimum of previous row
        int min1 = 0, min2 = 0, idx1 = -1;

        for (int i = 0; i < n; i++) {
            int newMin1 = Integer.MAX_VALUE;
            int newMin2 = Integer.MAX_VALUE;
            int newIdx1 = -1;

            for (int j = 0; j < k; j++) {

                int cost = costs[i][j];
                if (j == idx1) {
                    // cannot use the previous minimum (same color)
                    cost += min2;
                } else {
                    cost += min1;
                }

                // Update new minimums for current row
                if (cost < newMin1) {
                    newMin2 = newMin1;
                    newMin1 = cost;
                    newIdx1 = j;
                } else if (cost < newMin2) {
                    newMin2 = cost;
                }
            }

            // update for next row
            min1 = newMin1;
            min2 = newMin2;
            idx1 = newIdx1;
        }

        return min1;
    }
}