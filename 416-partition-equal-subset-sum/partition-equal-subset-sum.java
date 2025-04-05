
public class Solution {

    public static boolean canPartition(int[] arr) {
        int N = arr.length;
        int total = 0;

        for (int i = 0; i < N; i++) {
            total += arr[i];
        }

        // If total is odd, partition is not possible
        if ((total & 1) == 1) return false;

        int target = total / 2;
        int[][] dp = new int[N][target + 1];
        for (int[] row : dp) Arrays.fill(row, -1);

        return solveMem(0, arr, N, target, dp);
    }

    private static boolean solveMem(int index, int[] arr, int N, int target, int[][] dp) {
        if (target == 0) return true;
        if (index >= N || target < 0) return false;

        if (dp[index][target] != -1) {
            return dp[index][target] == 1;
        }

        boolean incl = solveMem(index + 1, arr, N, target - arr[index], dp);
        boolean excl = solveMem(index + 1, arr, N, target, dp);

        dp[index][target] = (incl || excl) ? 1 : 0;

        return dp[index][target] == 1;
    }
}
