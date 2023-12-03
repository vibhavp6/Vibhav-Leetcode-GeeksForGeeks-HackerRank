import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> complementMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            
            // Check if the complement exists in the map
            if (complementMap.containsKey(complement)) {
                return new int[]{complementMap.get(complement), i};
            }

            // If not, add the current element and its index to the map
            complementMap.put(nums[i], i);
        }

        // No solution found
        return new int[]{-1, -1};
    }
}
