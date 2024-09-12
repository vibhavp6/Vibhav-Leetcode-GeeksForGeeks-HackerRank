class Solution {
    public int missingNumber(int[] nums) {
        
    //     Arrays.sort(nums);
    //     int n = nums.length;
    //     for (int i =0; i<n; i ++) {
    //         if (nums [i] != i) {
    //             return i;
    //         }
    //     }
    //     return n;
    // }

    // hashset

    HashSet<Integer> hs = new HashSet<>();
        int n = nums.length;
        
        for (int i = 0; i <= n; i++) {
            hs.add(i);
        }
        
        for (int num : nums) {
            hs.remove(num);
        }
        
        return hs.toArray(new Integer[0])[0];
    }
}