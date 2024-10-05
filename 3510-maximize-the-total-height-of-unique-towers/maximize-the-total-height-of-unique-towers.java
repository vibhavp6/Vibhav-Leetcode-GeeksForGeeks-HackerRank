import java.util.Arrays;

class Solution {
    public long maximumTotalSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        long totalSum = 0;
        int prevHeight = Integer.MAX_VALUE;

        for (int i = n - 1; i >= 0; i--) {
            int height = Math.min(nums[i], prevHeight - 1);
            if (height <= 0) {
                return -1;
            }
            totalSum += height;
            prevHeight = height;
        }

        return totalSum;
    }
}
