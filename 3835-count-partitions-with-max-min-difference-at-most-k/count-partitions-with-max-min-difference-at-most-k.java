class Solution {
    public int countPartitions(int[] nums, int k) {
        int MOD = (int) 1e9 + 7, n = nums.length, left = 0;
        int[] dp = new int[n + 1], prefix = new int[n + 2]; 
        
        dp[0] = 1; prefix[1] = 1; 
        
        Deque<Integer> min = new ArrayDeque<>(), max = new ArrayDeque<>();
                
        for (int i = 0; i < n; i++) {
            while (!max.isEmpty() && nums[max.peekLast()] <= nums[i]) {
                max.pollLast();
            }
            max.addLast(i);
            
            while (!min.isEmpty() && nums[min.peekLast()] >= nums[i]) {
                min.pollLast();
            }
            min.addLast(i);
            
            while (nums[max.peekFirst()] - nums[min.peekFirst()] > k) {
                if (max.peekFirst() == left) max.pollFirst();
                if (min.peekFirst() == left) min.pollFirst();
                
                left++;
            }
            
            dp[i + 1] = (prefix[i + 1] - prefix[left] + MOD) % MOD;
            
            prefix[i + 2] = (prefix[i + 1] + dp[i + 1]) % MOD;
        }
        
        return dp[n];
    }
}