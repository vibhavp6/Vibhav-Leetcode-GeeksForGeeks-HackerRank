class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        for (int k = 1; k <= 60; k++) {
            long val = (long) num1 - (long) k * num2;
            if (val < 0) break;  // further k will only make val smaller (negative)
            
            int bitCount = Long.bitCount(val);
            if (bitCount <= k && k <= val) {
                return k; // minimum operations found
            }
        }
        return -1;
    }
}