class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {

        int n = arr.size();
        if (m == 0 || n == 0 || m > n) return 0;

        Collections.sort(arr);

        int res = Integer.MAX_VALUE;

        for (int i = 0; i <= n - m; i++) {
            int diff = arr.get(i + m - 1) - arr.get(i);
            res = Math.min(res, diff);
        }

        return res;
    }
}