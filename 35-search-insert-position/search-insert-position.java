class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1 ,  ans = -1;
        int length = nums.length;
        if ((target > nums[nums.length-1]))  return length;
        while(left<=right){
             int mid = left + (right - left) / 2;
             if (nums[mid] < target){
                left = mid+1;
             }
             else  {
                ans = mid;
                right = mid-1;
             }
        }
        return ans;
    }
}