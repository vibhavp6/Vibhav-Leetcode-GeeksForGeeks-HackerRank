class Solution {
    public int[][] divideArray(int[] a, int k) {
        int m = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            m = Math.max(m, a[i]);
        }

        int[] c = new int[m + 1];

        for (int i = 0; i < a.length; i++) {
            c[a[i]]++;
        }

        int[][] r = new int[a.length / 3][3];
        int i = 0, j = 0;

        for (int x = 0; x <= m; x++) {
            while (c[x] > 0) {
                r[i][j++] = x;
                if (j == 3) {
                    if (Math.abs(r[i][0] - r[i][2]) > k) {
                        return new int[0][0];
                    }
                    i++;
                    j = 0;
                }
                c[x]--;
            }
        }
        return r;
    }
}