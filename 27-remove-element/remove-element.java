class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        int count = 0;
        int n = nums.length;
        for (int i = 0; i<n; i ++) {
            if (nums[i] != val) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}