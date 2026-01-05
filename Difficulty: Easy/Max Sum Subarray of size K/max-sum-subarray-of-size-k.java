class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int ans = -1;
        for(int i = 0; i < arr.length; i++) {
            if(i > 0) arr[i] += arr[i - 1];
            if(i >= k - 1) {
                int sum = i - k < 0 ? 0 : arr[i - k];
                ans = Math.max(ans, arr[i] - sum);
            }
        }

        return ans;
    }
}