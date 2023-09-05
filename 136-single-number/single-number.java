class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        for (int i = 0 ; i<n; i++) {
            for (int j = i +1; j <n; j ++) {
                if (nums[i] == nums [j]) {
                    nums [i] = Integer.MIN_VALUE;
                    nums [j] = Integer.MIN_VALUE;
                }
            } 
        }
        int ans = -1 ;
        for (int i = 0; i<n; i++) {
            if (nums [i] > Integer.MIN_VALUE) {
                ans = nums [i];
            }
        }
        return ans;
    }
}