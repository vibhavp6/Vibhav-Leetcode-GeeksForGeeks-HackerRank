class Solution {
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            int x = 0;
            while ((1 << x) <= n) x++;
            x--;
            count += x * (1 << (x - 1));
            count += n - (1 << x) + 1;
            n -= (1 << x);
        }
        return count;
    }
}