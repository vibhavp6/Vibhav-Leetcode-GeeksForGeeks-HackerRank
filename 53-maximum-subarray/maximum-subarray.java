class Solution {
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE; 
        int currsum = 0;
        for (int i = 0; i<nums.length; i++) {
            currsum += nums[i];
            ans = Math.max(ans , currsum);
            if(currsum <= 0) {
                currsum = 0;
            }
        }
        return ans;
    }
}