class Solution {
    public int thirdMax(int[] nums) {
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (num == max1 || num == max2 || num == max3) {
                continue;
            }

            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }
        }

        if (max3 > Long.MIN_VALUE) {
            return (int) max3;
        } else {
            return (int) max1;
        }
    }
}
