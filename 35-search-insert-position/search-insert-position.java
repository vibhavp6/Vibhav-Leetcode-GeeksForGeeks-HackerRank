class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        
        // Returns the position of target in sorted array nums. 
        // If target is not present in nums, it would return the position where it can be inserted to maintain the sorted order of nums.
        for (int i=0; i<n; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        
        return n;
    }
}
