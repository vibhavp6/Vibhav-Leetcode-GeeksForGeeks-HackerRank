class Solution {
    public int[] runningSum(int[] nums) {
       int j = nums[0];
       int n =nums.length;
       for (int i  = 1; i<n; i++) {
           j += nums[i];
           nums[i] = j;
       } 
       return nums;
    }
}