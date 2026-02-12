class Solution {
    public int maxMinHeight(int[] arr, int k, int w) {
        int n = arr.length;
        
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        
        for (int num : arr) {
            low = Math.min(low, num);
            high = Math.max(high, num);
        }
        
        high = high + k; // maximum possible height
        
        int ans = low;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (canAchieve(arr, n, k, w, mid)) {
                ans = mid;
                low = mid + 1;   // try higher minimum
            } else {
                high = mid - 1;
            }
        }
        
        return ans;
    }
    
    private boolean canAchieve(int[] arr, int n, int k, int w, int target) {
        long[] diff = new long[n + 1];
        long operations = 0;
        long currentWater = 0;
        
        for (int i = 0; i < n; i++) {
            currentWater += diff[i];
            
            long currentHeight = arr[i] + currentWater;
            
            if (currentHeight < target) {
                long need = target - currentHeight;
                operations += need;
                
                if (operations > k) return false;
                
                currentWater += need;
                
                if (i + w < diff.length)
                    diff[i + w] -= need;
            }
        }
        
        return operations <= k;
    }
}