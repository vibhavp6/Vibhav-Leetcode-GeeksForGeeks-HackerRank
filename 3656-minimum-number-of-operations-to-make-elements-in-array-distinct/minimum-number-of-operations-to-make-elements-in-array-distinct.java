import java.util.*;

class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        Set<Integer> seen = new HashSet<>();
        for (int i = n - 1; i >= 0; i--) {
            if (seen.contains(nums[i])) {
                return i / 3 + 1;
            }
            seen.add(nums[i]);
        }
        return 0;
    }
}