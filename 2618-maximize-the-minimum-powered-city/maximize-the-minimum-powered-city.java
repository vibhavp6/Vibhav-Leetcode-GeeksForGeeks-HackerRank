import java.util.*;

class Solution {
    private long[] diffArray;  // difference array for efficient range updates
    private long[] cityPower;  // current power in each city
    private int n;

    // Check if it's possible to make every city's power >= target
    private boolean canAchieve(long target, int r, long kAvailable) {
        Arrays.fill(diffArray, 0);
        long runningAdd = 0;

        for (int i = 0; i < n; i++) {
            runningAdd += diffArray[i];
            long currentPower = cityPower[i] + runningAdd;

            if (currentPower < target) {
                long need = target - currentPower;
                kAvailable -= need;
                if (kAvailable < 0) return false;

                runningAdd += need;
                if (i + 2 * r + 1 < n)
                    diffArray[i + 2 * r + 1] -= need;
            }
        }
        return true;
    }

    public long maxPower(int[] stations, int r, int k) {
        n = stations.length;
        cityPower = new long[n];
        diffArray = new long[n];

        // Step 1: Compute total initial power per city using prefix sums
        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++)
            prefix[i + 1] = prefix[i] + stations[i];

        for (int i = 0; i < n; i++) {
            int left = Math.max(0, i - r);
            int right = Math.min(n - 1, i + r);
            cityPower[i] = prefix[right + 1] - prefix[left];
        }

        // Step 2: Binary search for the maximum possible minimum power
        long low = Arrays.stream(cityPower).min().getAsLong();
        long high = Arrays.stream(cityPower).max().getAsLong() + k;
        long best = 0;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (canAchieve(mid, r, k)) {
                best = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return best;
    }
}