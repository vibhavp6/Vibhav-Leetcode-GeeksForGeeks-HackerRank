class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int low = 1, high = Arrays.stream(quantities).max().getAsInt();
        while (low < high) {
            int mid = (low + high) / 2, needed = 0;
            for (int q : quantities) needed += (q + mid - 1) / mid;
            if (needed <= n) high = mid;
            else low = mid + 1;
        }
        return low;
    }
}