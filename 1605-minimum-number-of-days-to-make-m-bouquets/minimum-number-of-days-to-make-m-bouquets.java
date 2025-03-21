class Solution {
    public int check(int mid, int[] nums, int m, int k) {
        int count = 0, bouquet = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= mid) {
                count++;  
                if (count == k) { 
                    bouquet++;  // Formed a bouquet
                    count = 0;  // Reset for the next bouquet
                }
            } else {
                count = 0;  // Reset count if a flower is not ready
            }
        }
        return bouquet >= m ? 1 : 2;  // Correctly check against `m`
    }

    public int minDays(int[] nums, int m, int k) {
        if (m * k > nums.length) return -1;  // Not enough flowers to form `m` bouquets

        int left = Integer.MAX_VALUE, right = Integer.MIN_VALUE, ans = -1;
        
        for (int i = 0; i < nums.length; i++) {
            left = Math.min(left, nums[i]);
            right = Math.max(right, nums[i]);
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int flg = check(mid, nums, m, k); // Pass `m` correctly here
            if (flg == 2) {
                left = mid + 1;
            } else {
                ans = mid;
                right = mid - 1;
            }
        }
        return ans;
    }
}
