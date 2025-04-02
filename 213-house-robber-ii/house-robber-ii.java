import java.util.Arrays;

class Solution {

    public int helper (int [] nums, int index , int []dp) {
        if (index>= nums.length) return 0;

        if (dp[index] != -1) return dp [index];

        int take = nums[index] + helper(nums, index+2 , dp);
        int nottake = helper(nums, index+1 ,dp);

        return dp[index] = Math.max(take , nottake);
    }


    public int rob(int[] nums) {
        int n = nums.length;
        if( n ==1) return nums[0];
        int[] nums1 = Arrays.copyOfRange(nums, 0, n - 1);
        int[] nums2 = Arrays.copyOfRange(nums, 1, n);


        int [] dp1 = new int [n-1];
        int [] dp2 = new int [n-1];
        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);
        return Math.max(helper(nums1 , 0 , dp1), helper(nums2, 0, dp2));
    }
}