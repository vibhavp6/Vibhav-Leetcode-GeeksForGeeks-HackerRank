class Solution {
    public long maximumSubarraySum(int[] arr, int k) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        long sum = 0;
        long ans = 0;
        int st = 0;
        for(int i =0; i <arr.length; i++){
            mpp.put(arr[i],mpp.getOrDefault(arr[i] , 0) + 1);
            sum += arr[i];
            if(i-st+1 == k) {
                if(mpp.size() == k) {
                 ans = Math.max (ans,sum);
                }
               mpp.put(arr[st] ,mpp.get(arr[st]) -1);
                sum -= arr[st];
                if(mpp.get(arr[st]) == 0){
                  mpp.remove(arr[st]);
                }
                st++;
            }
        }
        return ans;
    }
}