class Solution {
    public int maximizeMedian(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        int md = (n-1)/2;
        long sm = k;
        int sz = 1,ans = k+arr[md];
        if(n%2==0){
            ans=(ans+arr[md+1])/2;
            sm+=arr[md++];
            sz++;
        }
        for(int i=md;i<n;i++){
            sm+=arr[i];
            int hf = (int)(sm/sz++);
            ans=Math.min(ans,hf);
        }
        return ans;
    }
}