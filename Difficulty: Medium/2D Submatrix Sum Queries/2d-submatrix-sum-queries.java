class Solution {
    public ArrayList<Integer> prefixSum2D(int[][] mat, int[][] queries) {
        int n = mat.length;
        int m = mat[0].length;

        // Step 1: Build prefix sum matrix
        int[][] ps = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ps[i][j] = mat[i][j];

                if (i > 0) ps[i][j] += ps[i - 1][j];
                if (j > 0) ps[i][j] += ps[i][j - 1];
                if (i > 0 && j > 0) ps[i][j] -= ps[i - 1][j - 1];
            }
        }

        // Step 2: Process queries
        ArrayList<Integer> result = new ArrayList<>();

        for (int[] q : queries) {
            int r1 = q[0], c1 = q[1], r2 = q[2], c2 = q[3];

            int sum = ps[r2][c2];

            if (r1 > 0) sum -= ps[r1 - 1][c2];
            if (c1 > 0) sum -= ps[r2][c1 - 1];
            if (r1 > 0 && c1 > 0) sum += ps[r1 - 1][c1 - 1];

            result.add(sum);
        }

        return result;
    }
}

