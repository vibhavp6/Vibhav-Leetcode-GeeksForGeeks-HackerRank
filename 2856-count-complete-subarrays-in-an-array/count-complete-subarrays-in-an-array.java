class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int totalDistinct = (int) Arrays.stream(nums).distinct().count();
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0, left = 0;

        for (int right = 0; right < nums.length; right++) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            while (map.size() == totalDistinct) {
                res += nums.length - right;
                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0)
                    map.remove(nums[left]);
                left++;
            }
        }
        return res;
    }
}