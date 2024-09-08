class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Boolean> hm = new HashMap<>();
        for (int i =0; i<nums.length; i++) {
            int num = nums[i];
            if (hm.containsKey(num)) {
                return true;
            } else {
                hm.put(num,true) ;
            }
        }
        return false;
    }
}