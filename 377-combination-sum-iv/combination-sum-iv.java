
public class Solution {
    public static int combinationSum4(int[] num, int tar) {
        int[] dp = new int[tar + 1];
        Arrays.fill(dp, -1);
        return solveMem(num, tar, dp);
    }

    private static int solveMem(int[] num, int tar, int[] dp) {
        // base cases
        if (tar < 0)
            return 0;
        if (tar == 0)
            return 1;

        if (dp[tar] != -1)
            return dp[tar];

        int ans = 0;
        for (int i = 0; i < num.length; i++) {
            ans += solveMem(num, tar - num[i], dp);
        }

        dp[tar] = ans;
        return dp[tar];
    }
}
