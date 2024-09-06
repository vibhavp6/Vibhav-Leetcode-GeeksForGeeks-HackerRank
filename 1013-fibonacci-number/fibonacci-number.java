class Solution {
    public int fib(int n) {
        int a = 0;
        int b = 1;
        int c = 0;

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            for (int i = 2; i <= n; i++) {
                int nt = a + b;  // Next term is sum of previous two
                a = b;           // Update a to previous b
                b = nt;          // Update b to the next term
                c = nt;          // Update c to the current Fibonacci number
            }
            return c;  // Return the nth Fibonacci number
        }
    }
}

