class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n -1;
        int k = 0;
        while (k <= right) {
            if (nums[k] == 0 ) {
               swap(nums,k,left);
               left ++;
               k ++;
            } else if ( nums[k] == 2) {
                swap(nums,k,right);
                    right --;
            } else {
            k++;
            } 
        }
    }
    public void swap (int[] nums, int i, int j) { 
    int temp = nums[i]; 
    nums[i] = nums[j];
    nums[j] = temp;
 }

}