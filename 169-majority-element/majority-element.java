class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int vib = nums.length;
        for (int i = 0; i<nums.length; i++) {
            int num = nums[i];
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i<nums.length; i++) {
            int num = nums[i];
            if (hm.get(num) > vib/2) {
                return num;
            }
        }
        return -1;        
    }
}