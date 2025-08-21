import java.util.Arrays;

class Solution {
    public int maxMinDiff(int[] arr, int k) {
        Arrays.sort(arr);
        int low = 0, high = arr[arr.length - 1] - arr[0], ans = 0;
        while (low <= high) {
            int mid = (low + high) / 2, count = 1, last = arr[0];
            for (int i = 1; i < arr.length && count < k; i++) {
                if (arr[i] - last >= mid) { count++; last = arr[i]; }
            }
            if (count >= k) { ans = mid; low = mid + 1; }
            else high = mid - 1;
        }
        return ans;
    }
}