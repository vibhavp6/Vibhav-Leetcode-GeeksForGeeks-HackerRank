class Solution {
    public long maxRunTime(int n, int[] batteries) {
        long sum = 0;
        for (int b : batteries) sum += b;

        long left = 0, right = sum / n;

        while (left < right) {
            long mid = (left + right + 1) >> 1;
            long need = mid * n, have = 0;

            for (int b : batteries) 
                have += Math.min(b, mid);

            if (have >= need) left = mid;
            else right = mid - 1;
        }

        return left;
    }
}