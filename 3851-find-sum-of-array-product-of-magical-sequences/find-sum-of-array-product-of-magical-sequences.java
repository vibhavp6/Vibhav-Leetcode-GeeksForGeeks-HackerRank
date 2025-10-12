public class Solution {
    static final int MOD = 1_000_000_007;

    public int magicalSum(int m, int k, int[] nums) {
        int n = nums.length;

        // Precompute powtab[i][c] = nums[i]^c mod MOD for c in [0..m]
        long[][] powtab = new long[n][m + 1];
        for (int i = 0; i < n; i++) {
            powtab[i][0] = 1;
            for (int c = 1; c <= m; c++) {
                powtab[i][c] = (powtab[i][c - 1] * nums[i]) % MOD;
            }
        }

        // Precompute combinations comb[r][c] = C(r, c) mod MOD for r,c in [0..m]
        long[][] comb = new long[m + 1][m + 1];
        for (int i = 0; i <= m; i++) {
            comb[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                comb[i][j] = (comb[i - 1][j - 1] + comb[i - 1][j]) % MOD;
            }
        }

        // dp[rem][carry][ones] holds the running total after processing some prefix of indices:
        // rem picks left to place, current carry value, ones bits produced so far
        long[][][] dp = new long[m + 1][m + 1][k + 1];
        dp[m][0][0] = 1; // start with all m picks remaining, carry = 0, ones = 0

        for (int i = 0; i < n; i++) {
            long[][][] next = new long[m + 1][m + 1][k + 1];
            long[] powi = powtab[i];
            for (int rem = 0; rem <= m; rem++) {
                for (int carry = 0; carry <= m; carry++) {
                    for (int ones = 0; ones <= k; ones++) {
                        long base = dp[rem][carry][ones];
                        if (base == 0) continue;
                        // Choose c copies of index i among the rem remaining positions
                        for (int c = 0; c <= rem; c++) {
                            int t = c + carry;           // add c to current bit with carry in
                            int bit = t & 1;             // output bit at this position
                            int ones2 = ones + bit;      // update ones count
                            if (ones2 > k) continue;
                            int carry2 = t >>> 1;        // carry to the next bit
                            int rem2 = rem - c;

                            // Transition weight = comb[rem][c] (ways to place c copies) * nums[i]^c
                            long add = base;
                            add = (add * comb[rem][c]) % MOD;
                            add = (add * powi[c]) % MOD;

                            next[rem2][carry2][ones2] = (next[rem2][carry2][ones2] + add) % MOD;
                        }
                    }
                }
            }
            dp = next;
        }

        // Finish: only states with rem = 0 are valid
        // Leftover carry still contributes popcount(carry) ones
        long ans = 0;
        for (int carry = 0; carry <= m; carry++) {
            int extra = Integer.bitCount(carry);
            int need = k - extra;
            if (need >= 0 && need <= k) {
                ans = (ans + dp[0][carry][need]) % MOD;
            }
        }
        return (int) ans;
    }
}