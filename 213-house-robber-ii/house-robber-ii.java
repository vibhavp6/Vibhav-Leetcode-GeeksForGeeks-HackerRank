class Solution {
    private int solve(int index, int[] nums, int[] dp) {
        if (index >= nums.length) return 0;
        if (dp[index] != -1) return dp[index];

        int take = nums[index] + solve(index + 2, nums, dp);
        int notTake = solve(index + 1, nums, dp);

        return dp[index] = Math.max(take, notTake);
    }

    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];

        int[] nums1 = Arrays.copyOfRange(nums, 0, n - 1);
        int[] nums2 = Arrays.copyOfRange(nums, 1, n);

        int[] dp1 = new int[n - 1];
        int[] dp2 = new int[n - 1];

        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        return Math.max(solve(0, nums1, dp1), solve(0, nums2, dp2));
    }
}