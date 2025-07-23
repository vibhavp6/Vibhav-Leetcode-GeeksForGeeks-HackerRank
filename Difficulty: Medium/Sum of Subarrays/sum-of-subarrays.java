class Solution {
    public int subarraySum(int[] arr) {
        int n=arr.length;
        int[] prefix=new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=(i+1)*prefix[i];
            sum-=(n-i-1)*(prefix[i]);
        }
        return sum;
    }
}