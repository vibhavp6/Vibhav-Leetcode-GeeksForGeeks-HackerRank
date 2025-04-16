class Solution {
    public long countGood(int[] nums, int k) {
        // Kakashi's ninja notebook: tracking each number's appearance
        Map<Integer, Integer> freq = new HashMap<>();
        
        long ans = 0;        // Hinata gently counting how many good subarrays
        long pairs = 0;      // Naruto yelling out number of friendly pairs
        int left = 0;        // Sasuke, the calmer one, trying to keep things balanced

        // Naruto: charging forward into each element
        for (int right = 0; right < nums.length; right++) {
            int val = nums[right];

            // Kakashi: "How many clones of this value already in the mission?"
            pairs += freq.getOrDefault(val, 0);  // More clones? More pairs!
            
            // Add this clone to the ninja logbook
            freq.put(val, freq.getOrDefault(val, 0) + 1);

            // Time to check if we've got enough pairs
            while (pairs >= k) {
                // If we’ve got at least k pairs, 
                // all subarrays starting from current left to the end of array are valid
                ans += nums.length - right;

                // Sasuke: Time to shrink the team from left
                int out = nums[left++];
                freq.put(out, freq.get(out) - 1);   // Kakashi updates notebook
                pairs -= freq.get(out);             // Reduce pair count for removed value
            }
        }

        return ans;
    }
}