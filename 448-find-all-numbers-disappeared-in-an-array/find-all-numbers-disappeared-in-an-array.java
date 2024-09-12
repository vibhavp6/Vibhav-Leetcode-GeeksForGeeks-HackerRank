class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet <Integer> hs  = new HashSet  <>();
        int n = nums.length;
        for (int i = 1; i<=n; i++) {
            hs.add(i);
        }
        HashSet<Integer> hs2 = new HashSet <>();
        for (int i = 0; i<n; i++) {
            if(hs.contains(nums[i])) {
            hs.remove(nums[i]);
            }
        }
        return new ArrayList<>(hs);
    }
}