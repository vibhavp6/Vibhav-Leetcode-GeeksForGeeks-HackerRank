class Solution {
    public int maximumAmount(int arr[]) {
        int n = arr.length;
        long dp[][] = new long[n][n];
        for(int i=0;i<n;i++) dp[i][i] = arr[i];
        for(int len=2; len<=n; len++){
            for(int i=0; i+len-1<n; i++){
                int j = i + len - 1;
                long left = arr[i] + Math.min((i+2<=j ? dp[i+2][j] : 0),
                                              (i+1<=j-1 ? dp[i+1][j-1] : 0));
                long right = arr[j] + Math.min((i<=j-2 ? dp[i][j-2] : 0),
                                               (i+1<=j-1 ? dp[i+1][j-1] : 0));
                dp[i][j] = Math.max(left, right);
            }
        }
        return (int)dp[0][n-1];
    }
}