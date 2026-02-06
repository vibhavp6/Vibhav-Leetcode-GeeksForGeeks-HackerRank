class Solution {
    public int minRemoval(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int ans = 0;
        for(int i = 0, j = 0; i < n; i ++){
            while(j + 1 < n && (long) nums[i] * (long) k >= nums[j + 1]){
                j ++;
            }
            ans = Math.max(ans, j - i + 1);
        }
        return n - ans;
    }
}