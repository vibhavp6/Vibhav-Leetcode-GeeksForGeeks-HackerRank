
class Solution {
    public int longestCommonSum(int[] a1, int[] a2) {
        int n = a1.length;
        int[] diff = new int[n];
        
        // Step 1: Calculate difference array
        for (int i = 0; i < n; i++) {
            diff[i] = a1[i] - a2[i];
        }

        // Step 2: Find longest subarray with sum = 0
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            prefixSum += diff[i];

            // If prefix sum is 0, whole array from 0 to i has equal sum
            if (prefixSum == 0) {
                maxLen = i + 1;
            }

            // If prefix sum was seen before
            if (map.containsKey(prefixSum)) {
                int prevIndex = map.get(prefixSum);
                maxLen = Math.max(maxLen, i - prevIndex);
            } else {
                map.put(prefixSum, i);
            }
        }

        return maxLen;
    }
}