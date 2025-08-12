class Solution {
    public int[] productQueries(int n, int[][] queries) {
        int power = 1, MOD = (int) 1e9 + 7;
        while (power <= n) power <<= 1;
        power >>= 1;

        List<Integer> powers = new ArrayList<>();
        while (n > 0) {
            if (power <= n) {
                powers.add(power);
                n -= power;
            }
            power >>= 1;
        }

        n = powers.size();
        int[][] prefix = new int[n][n];
        for (int i = 0; i < n; i++) {
            prefix[i][i] = powers.get(n - 1 - i);
            for (int j = i + 1; j < n; j++)
                prefix[i][j] = (int)((1L * prefix[i][j - 1] * powers.get(n - 1 - j)) % MOD);
        }

        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++)
            res[i] = prefix[queries[i][0]][queries[i][1]];

        return res;
    }
}