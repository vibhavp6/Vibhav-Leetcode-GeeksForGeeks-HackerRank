class Solution {
    public int subarrayXor(int[] arr) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int count = (i + 1) * (n - i);
            if ((count & 1) == 1) {
                ans ^= arr[i];
            }
        }
        return ans;
    }
}