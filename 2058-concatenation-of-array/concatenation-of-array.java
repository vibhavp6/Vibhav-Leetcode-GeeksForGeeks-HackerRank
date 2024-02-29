class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int []  vib = new int [2*n];
        for (int i =0; i<n; i++){
            vib [i] = nums[i];
            vib [i+n] = nums [i];
        }
        return vib;
    }
}