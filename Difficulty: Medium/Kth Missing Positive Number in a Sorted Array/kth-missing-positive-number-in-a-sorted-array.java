class Solution {
    public int kthMissing(int[] arr, int k) {
        int n = arr.length;

        // If kth missing is beyond the last element
        if (arr[n - 1] - n < k) {
            return arr[n - 1] + (k - (arr[n - 1] - n));
        }

        int low = 0, high = n - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            int missing = arr[mid] - (mid + 1);

            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        // kth missing number
        return low + k;
    }
}