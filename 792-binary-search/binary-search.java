class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        for (int i =0;i < n ; i ++) {
            
                if (nums[i] == target) {
                    return i;
                }
        
        }
        return -1;
    }
}