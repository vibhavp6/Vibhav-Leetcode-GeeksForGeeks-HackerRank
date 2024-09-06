class Solution {
    public int thirdMax(int[] nums) {
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;

        for (int num : nums) {
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

        // Return using an if-else statement.
        if (max3 > Long.MIN_VALUE) {
            return (int) max3;
        } else {
            return (int) max1;
        }
    }
}
