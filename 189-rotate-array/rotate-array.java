class Solution {
	 public static void reverse(int nums[], int i, int j){
        // int i = 0;
        // int j = nums.length -1;
        
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        k = k % nums.length; 
        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }
}
