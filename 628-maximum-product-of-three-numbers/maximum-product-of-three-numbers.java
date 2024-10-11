class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        long a = nums[0];
        long b = nums[1];
        long c = nums[n-1];
        long d = nums [n-2];
        long e = nums[n-3];

        long p1 = a*b*c;
        long p2 = c*d*e;
        long max = Math.max(p1,p2);
        return (int) max;
    }
    

}