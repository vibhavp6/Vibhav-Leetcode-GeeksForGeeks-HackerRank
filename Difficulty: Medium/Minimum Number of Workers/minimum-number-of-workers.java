class Solution {
    public int minMen(int[] arr) {
        int n = arr.length;

        int coveredTill = 0;   // current covered hour
        int count = 0;

        while (coveredTill < n) {
            int farthest = coveredTill;

            // Try all people to extend coverage
            for (int i = 0; i < n; i++) {
                if (arr[i] == -1) continue;

                int start = Math.max(0, i - arr[i]);
                int end   = Math.min(n - 1, i + arr[i]);

                if (start <= coveredTill) {
                    farthest = Math.max(farthest, end + 1);
                }
            }

            // If no progress, impossible
            if (farthest == coveredTill) {
                return -1;
            }

            coveredTill = farthest;
            count++;
        }

        return count;
    }
}


