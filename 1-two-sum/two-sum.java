class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i =0; i<nums.length; i++) {
            int num = nums[i];
            int diff = target - nums[i];
            if (hm.containsKey(diff)) {
                int temp = hm.get(diff) ;
                    int [] result = new int [2];
                    result[0] = temp;
                    result[1] = i;
                    return result;
            }
            else {
                hm.put(num, i);
            }
        }
        return new int [0];
    }
}