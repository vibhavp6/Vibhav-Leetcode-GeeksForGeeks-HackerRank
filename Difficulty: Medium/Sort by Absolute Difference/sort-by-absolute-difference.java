class Solution {
    public void rearrange(int[] arr, int x) {
        // code here
        int len = arr.length;
        int[][] dp = new int[len][2];
        for(int i = 0 ; i < len ; i++){
           int ab = (int)Math.abs(arr[i] - x);
           dp[i][0] = arr[i];
           dp[i][1] = ab;
        }
        Arrays.sort(dp , (a , b) -> a[1] - b[1]);
        for(int i = 0 ; i < len ; i++){
            arr[i] = dp[i][0];
        }
    }
}