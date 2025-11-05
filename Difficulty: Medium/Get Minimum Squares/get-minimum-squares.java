class Solution {
    public int minSquares(int n) {
        // return solve(n);
        int dp[] = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        // return memo(n, dp);
        return tabulation(n, dp);
    }
    
    //Recursion TC = O((root(n))^n )
    int solve(int n) {
        if (n == 0) return 0;

        int minCount = Integer.MAX_VALUE;

        for (int i = 1; i * i <= n; i++) {
            int square = i * i;
            minCount = Math.min(minCount, 1 + solve(n - square));
        }

        return minCount;
    }
    
    
    // Memoization TC = O(n * root(n))
    int memo(int n, int dp[]) {
        if (n == 0) return 0;
        if(dp[n] != -1) return dp[n];
        int minCount = Integer.MAX_VALUE;

        for (int i = 1; i * i <= n; i++) {
            int square = i * i;
            minCount = Math.min(minCount, 1 + memo(n - square, dp));
        }

        return dp[n]=minCount;
    }
    
    
    // tabulation TC = O(n * root(n))
    int tabulation(int n, int dp[]){
        for(int i = 1;i <= n;i++){
            for(int j = 1;j*j <= i;j++){
                if(dp[i - j*j] != Integer.MAX_VALUE)
                dp[i] = Math.min(dp[i], 1+dp[i-j*j]);
            }
        }
        return dp[n];
    }
}