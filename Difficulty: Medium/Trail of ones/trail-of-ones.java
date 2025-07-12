class Solution {
    public int countConsec(int n) {
        // code here
        if(n == 0) return 0;
        
        int[] a = new int[n + 1]; // ends with 0
        int[] b = new int[n + 1]; // ends with 1
        
        a[1] = 1;
        b[1] = 1;

        for(int i = 2; i <= n; i++) {
            a[i] = a[i - 1] + b[i - 1];
            b[i] = a[i - 1];
        }
        
        int total = (1 << n); // 2^n
        int noConsecOnes = a[n] + b[n];
        return total - noConsecOnes;
    }
}
