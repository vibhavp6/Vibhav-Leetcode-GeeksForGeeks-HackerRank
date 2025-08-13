class Solution {
    public int minSoldiers(int[] arr, int k) {
        // code here
        int n=arr.length;
        for(int i=0;i<n;i++){
            arr[i]%=k;
            if(arr[i]!=0) arr[i]=k-arr[i];
        } 
        Arrays.sort(arr);
        int ans=0;
        for(int i=0;i<(n+1)/2;i++) ans+=arr[i];
        return ans;
    }
}


