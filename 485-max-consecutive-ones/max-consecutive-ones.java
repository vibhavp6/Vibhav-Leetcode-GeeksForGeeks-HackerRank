class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int j =0, maxOnes = 0;
        for (int i =0; i<n; i++) {
            if (nums[i] == 1) {
                 j++;
                 maxOnes = Math.max(maxOnes, j); // keep track of maximum consecutive ones
            } else if (nums[i] == 0 ){
                j = 0; // reset current consecutive ones count
            }
        }
        return maxOnes; // return the maximum consecutive ones
    }
}
