class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0; // No elements to process
        }
        
        int j = 0; // Pointer for the last unique element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i]; // Move the pointer and update the value
            }
        }
        return j + 1; // Length of the array with unique elements
    }
}
