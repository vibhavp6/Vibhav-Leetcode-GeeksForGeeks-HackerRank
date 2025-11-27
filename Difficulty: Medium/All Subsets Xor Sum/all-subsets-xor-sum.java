class Solution {
    int subsetXORSum(int arr[]) {
        int n = arr.length;
        int ans = 0;

        for (int bit = 0; bit <= 10; bit++) {
            int countSet = 0;
            for (int i = 0; i < n; i++) {
                if ((arr[i] & (1 << bit)) != 0) {
                    countSet++;
                }
            }
            if (countSet > 0) {
                ans += (1 << bit) * (1 << (n - 1));
            }
        }
        return ans;
    }
}