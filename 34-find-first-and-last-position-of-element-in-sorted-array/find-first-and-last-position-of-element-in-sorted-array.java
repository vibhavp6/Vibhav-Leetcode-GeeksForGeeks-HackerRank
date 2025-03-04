class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] ans =  new int [2];
        ans[0] = -1; 
        ans[1] = -1;
        int left = 0, right  = nums.length-1;
        while (left<=right) {
            int mid = left + (right-left)/2;
            if(nums[mid] == target) {
                ans [0] = mid;
                right = mid -1;
            }
            else if(nums[mid] < target) left = mid +1;
            else {
                right = mid-1;
            }
        }
        int lef = 0, righ  = nums.length-1;
        while (lef<=righ) {
            int mid = lef + (righ-lef)/2;
            if(nums[mid] == target) {
                ans [1] = mid;
                lef = mid + 1;
            }
            else if(nums[mid] < target) lef = mid +1;
            else {
                righ = mid-1;
            }
        }
        return  ans;
    }
}