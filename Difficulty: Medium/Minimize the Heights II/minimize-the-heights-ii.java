class Solution {
    public int getMinDiff(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        int ans=arr[n-1]-arr[0];
        for(int i=n-2;i>=0;i--){
            if(arr[i+1]<k){
                break;
            }
            int min=Math.min(arr[i+1]-k,arr[0]+k);
            int max=Math.max(arr[i]+k,arr[n-1]-k);
            ans=Math.min(ans,max-min);
        }
        return ans;
    }
}
