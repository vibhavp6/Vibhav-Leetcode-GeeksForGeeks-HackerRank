class Solution {
    public int check (int mid , int [] nums , int threshold) {
        long ans = 0;
        for (int i = 0; i<nums.length; i++) {
            ans += nums[i]/mid; // jab bhi divide ho make sure mid ki value zero na ho i.e. left =1;
            if(nums[i]%mid != 0) {
                ans += 1;
            }
             if (ans > threshold) return 1;
        }
         return 0;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1,  right = -1, ans = -1;
        int max = nums[0];
        for (int i = 0; i<nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }

        }
        right = max;

        while(left<= right) {
            int mid = left + (right-left)/2;
            int flg = check(mid,nums,threshold);
            if(flg == 1) {
                left = mid +1;
            }
            else if (flg == 0) {
                ans = mid;
                right = mid -1;
            }
        }
        return ans;
    }
}