class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0 , right = nums.length-1;
        int [] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        while (left<=right) {
            int mid = left +(right - left)/2;
            if (nums[mid] == target)  {
                ans [0] = mid;
                right = mid-1;
            }
            else if (nums[mid] > target) {
                right = mid -1;
            } else {
                left = mid +1;
            }
        }
        left = 0 ;
         right = nums.length-1;
        while (left<=right) {
            int mid = left +(right - left)/2;
            if (nums[mid] == target)  {
                ans [1] = mid;
                left = mid +1;
            }
            else if (nums[mid] > target) {
                right = mid -1;
            } else {
                left = mid +1;
            }
        }
        return ans;
    }
}