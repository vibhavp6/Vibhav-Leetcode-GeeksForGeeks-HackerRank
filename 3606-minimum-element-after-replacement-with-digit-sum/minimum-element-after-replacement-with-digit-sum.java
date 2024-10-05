class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE; 
        int n = nums.length;
       for (int i = 0; i< n; i++) {
        int num = nums[i];
        int sum =0;

        while (num > 0) {
            int ld = num%10;
            sum += ld;
            num = num/10;
        } 

        nums[i] = sum;

        if (min > sum) {
            min = sum;
        }

       }
       return min;
        
    }
}