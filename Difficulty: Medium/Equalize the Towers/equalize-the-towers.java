class Solution {
    public int minCost(int[] heights, int[] cost) {
        // code here
          int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
         for (int h : heights) {
            low = Math.min(low, h);
            high = Math.max(high, h);
        }
        
        int ans = Integer.MAX_VALUE;
        
        while (low <= high) {
            int mid = (low + high) / 2;

            int costMid = helper(heights, cost, mid);
            int costLeft = helper(heights, cost, mid - 1);
            int costRight = helper(heights, cost, mid + 1);

            ans = Math.min(ans, costMid);

            // Move in direction of lower cost
            if (costLeft < costMid) {
                high = mid - 1;
            } else if (costRight < costMid) {
                low = mid + 1;
            } else {
                break; // Found local minimum
            }
        }
        
        
        return ans;
    }
    
    
    
    private int helper(int[] heights, int[] cost, int targetHeight) {
        int totalCost = 0;
        for (int i = 0; i < heights.length; i++) {
            totalCost += Math.abs(heights[i] - targetHeight) * cost[i];
        }
        return totalCost;
    }
}

