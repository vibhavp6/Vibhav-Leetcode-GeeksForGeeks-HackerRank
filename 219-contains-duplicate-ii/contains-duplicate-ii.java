class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i=0; i< nums.length; i++){
            int num = nums[i];
            if (hm.containsKey(num)) {
                int temp = hm.get(num);
                int diff = Math.abs(i - temp);
                if (diff <= k) return true;
            } 
            hm.put(num, i);
        }
        return false;
    }
}