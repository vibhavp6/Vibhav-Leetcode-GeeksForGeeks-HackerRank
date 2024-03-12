import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n - 2; ++i) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int target = -nums[i];
            int st = i + 1, ed = n - 1;
            while (st < ed) {
                int sum = nums[st] + nums[ed];
                if (sum == target) {
                    ans.add(Arrays.asList(nums[i], nums[st], nums[ed]));
                    while (st < ed && nums[st] == nums[st + 1]) ++st;
                    while (st < ed && nums[ed] == nums[ed - 1]) --ed;
                    ++st;
                    --ed;
                } else if (sum < target) {
                    ++st;
                } else {
                    --ed;
                }
            }
        }
        return ans;
    }
}
