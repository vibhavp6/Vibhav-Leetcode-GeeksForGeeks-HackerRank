class Solution {
    public long coloredCells(int n) {
        if(n == 1) return 1;
        return 2L * n * (n-1) + 1;  // L -> To prevent overflow
    }
}