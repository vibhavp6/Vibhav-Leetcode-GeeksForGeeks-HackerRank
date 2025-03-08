class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> mpp = new HashMap<>();
        long sum = 0, ans = 0;
        int st = 0;

        for (int i = 0; i < nums.length; i++) {
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
            sum += nums[i];

            if (i - st + 1 == k) {
                if (mpp.size() == k) {
                    ans = Math.max(ans, sum);
                }

                mpp.put(nums[st], mpp.get(nums[st]) - 1);
                sum -= nums[st];

                if (mpp.get(nums[st]) == 0) {
                    mpp.remove(nums[st]);
                }

                st++;
            }
        }
        return ans;
    }
}