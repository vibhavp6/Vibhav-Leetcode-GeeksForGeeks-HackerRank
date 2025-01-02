class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> ss = new HashSet<>();
        for (int num : nums1) {
            ss.add(num);
        }

        HashSet <Integer> sm = new HashSet <>();
        for (int num : nums2) {
            if (ss.contains(num)) {
                sm.add(num);
            }
        }
        int[] ans = new int[sm.size()];
        int index = 0;
        for (int num : sm) {
            ans[index++] = num;
        }
        return ans;
    }
}