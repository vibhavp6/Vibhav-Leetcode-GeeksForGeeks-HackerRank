class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0; // \U0001f365 Shadow Clone counter

        for (int num = low; num <= high; num++) {
            String str = Integer.toString(num); // \U0001f3ad Transform number to string
            int len = str.length();

            // \U0001f525 Skip if it doesn't have even chakra balance (odd number of digits)
            if (len % 2 != 0) continue;

            int half = len / 2;
            int leftSum = 0;
            int rightSum = 0;

            // ⬅️ Sum of the left half (first n digits)
            for (int i = 0; i < half; i++) {
                leftSum += str.charAt(i) - '0';
            }

            // ➡️ Sum of the right half (last n digits)
            for (int i = half; i < len; i++) {
                rightSum += str.charAt(i) - '0';
            }

            // ☯️ If chakra is balanced, count it
            if (leftSum == rightSum) {
                count++;
            }
        }

        return count; // \U0001f365 Final mission report
    }
}