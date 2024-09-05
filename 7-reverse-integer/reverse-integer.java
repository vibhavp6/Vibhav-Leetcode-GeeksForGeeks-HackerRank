class Solution {
    public int reverse(int x) {
        long rev = 0;
        while (x != 0) {
            int lastDigit = x % 10;
            rev = rev * 10 + lastDigit;
            
            // Check for overflow
            if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
                return 0; // Return 0 if overflow occurs
            }

            x = x / 10;
        }
        return (int) rev; // Safely cast rev to int since we've checked for overflow
    }
}

