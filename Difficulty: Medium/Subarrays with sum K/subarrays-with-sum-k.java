class Solution {
    public int cntSubarrays(int[] arr, int k) {
       int n = arr.length;
       HashMap<Integer,Integer> map = new HashMap<>();
       int sum = 0;
       int count = 0;
       map.put(0,1);
       
       for(int i=0;i<n;i++){
           sum = sum + arr[i];
           if(map.containsKey(sum-k)) count = count+map.get(sum-k);
           if(map.containsKey(sum)) map.put(sum,map.get(sum)+1);
           else map.put(sum,1);
       }
       return count;
    }
}