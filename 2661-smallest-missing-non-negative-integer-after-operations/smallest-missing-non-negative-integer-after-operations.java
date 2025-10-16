class Solution {
    public int findSmallestInteger(int[] nums, int value) {
         int[] freq = new int[value];

        // Count frequency of each remainder
        for (int num : nums) {
            int rem = ((num % value) + value) % value;
            freq[rem]++;
        }

        int mex = 0;
        while (true) {
            int rem = mex % value;
            if (freq[rem] > 0) {
                freq[rem]--;
                mex++;
            } else {
                return mex;
            }
        }
    }
}