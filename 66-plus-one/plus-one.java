class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = digits.length-1; i>=0; i--) {
            if (digits[i] <9) {
                digits[i] += 1;
                return digits;
            }else {
                digits[i] = 0;
            }
        }

        int [] result = new int [n+1];
        result [0] = 1;
        for (int i= 1; i<=n; i++) {
            result[i] = 0;
        }
        return result;

    }
}