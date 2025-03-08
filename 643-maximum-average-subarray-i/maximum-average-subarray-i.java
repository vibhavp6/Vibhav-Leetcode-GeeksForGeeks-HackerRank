class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int st =0;
        double ans =    Integer.MIN_VALUE;
        double sum = 0; 
        for(int i = 0; i<arr.length; i++) {
            sum+= arr[i];
            if(i-st+1 == k) {
                ans = Math.max(ans,sum*1.0/k);
                sum -= arr[st];
                st++;
            }
        }
        return ans;
    }
}