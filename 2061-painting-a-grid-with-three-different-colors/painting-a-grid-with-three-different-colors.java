class Solution {
    public int colorTheGrid(int m, int n) {
        final int MOD = 1_000_000_007;
        List<Integer> states = new ArrayList<>();
        dfs(0, -1, 0, m, states);
        int S = states.size();
        List<List<Integer>> compat = new ArrayList<>(S);
        for (int i = 0; i < S; i++) compat.add(new ArrayList<>());
        for (int i = 0; i < S; i++) {
            for (int j = 0; j < S; j++) {
                int x = states.get(i), y = states.get(j);
                boolean ok = true;
                for (int k = 0; k < m; k++) {
                    if (x % 3 == y % 3) { ok = false; break; }
                    x /= 3; y /= 3;
                }
                if (ok) compat.get(i).add(j);
            }
        }
        int[] dp = new int[S];
        Arrays.fill(dp, 1);
        int[] new_dp = new int[S];
        for (int t = 0; t < n - 1; t++) {
            Arrays.fill(new_dp, 0);
            for (int i = 0; i < S; i++) {
                if (dp[i] != 0) {
                    for (int j : compat.get(i)) {
                        new_dp[j] = (new_dp[j] + dp[i]) % MOD;
                    }
                }
            }
            int[] tmp = dp; dp = new_dp; new_dp = tmp;
        }
        long ans = 0;
        for (int v : dp) ans = (ans + v) % MOD;
        return (int)ans;
    }

    private void dfs(int pos, int prev_color, int mask, int m, List<Integer> states) {
        if (pos == m) {
            states.add(mask);
            return;
        }
        for (int color = 0; color < 3; color++) {
            if (color != prev_color) {
                dfs(pos + 1, color, mask * 3 + color, m, states);
            }
        }
    }
}