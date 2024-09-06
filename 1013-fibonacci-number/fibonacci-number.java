class Solution {
    public int fib(int n) {
        if (n <=1) return n;

        int l = n-1;
        int sl = n-2;

        return fib(sl) +fib(l);
    }
}