class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int ans = 0;
        int sum = 0;
        HashMap<Integer , Integer> mpp = new HashMap<>();
        mpp.put(0,1);
        for(int num : nums) {
            sum += num;

            if(mpp.containsKey(sum - goal)) {
                ans  += mpp.get(sum - goal);
            }

            mpp.put(sum , mpp.getOrDefault(sum , 0) +1);
        }
        return ans;
    }
}