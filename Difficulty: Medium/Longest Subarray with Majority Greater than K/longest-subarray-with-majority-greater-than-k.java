class Solution {
    static int longestSubarray(int[] arr, int k) {
        // Code Here
        int n = arr.length;
        int prefixSum = 0;
        int maxLen = 0;
        
        Map<Integer , Integer> hm = new HashMap<>();
        hm.put(0 , -1);
        
        for (int i = 0 ; i < n ; i++) {
            prefixSum += (arr[i] > k)?1:-1;
            
            if (prefixSum > 0) maxLen = i + 1;    
            
            if (hm.containsKey(prefixSum - 1)){
                maxLen = Math.max(maxLen , i - hm.get(prefixSum - 1));
            }
            
            if (!hm.containsKey(prefixSum)) hm.put(prefixSum , i);
        }
        return maxLen;
    }
}