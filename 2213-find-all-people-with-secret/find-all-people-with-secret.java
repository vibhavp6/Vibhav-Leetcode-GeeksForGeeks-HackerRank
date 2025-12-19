class Solution {
    public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {
        Arrays.sort(meetings, (a, b) -> a[2] - b[2]);

        int[] parent = new int[n];
        boolean[] know = new boolean[n];
        for (int i = 0; i < n; i++) parent[i] = i;

        know[0] = know[firstPerson] = true;

        for (int i = 0; i < meetings.length; ) {
            int t = meetings[i][2];
            List<Integer> list = new ArrayList<>();

            int j = i;
            while (j < meetings.length && meetings[j][2] == t) {
                union(meetings[j][0], meetings[j][1], parent);
                list.add(meetings[j][0]);
                list.add(meetings[j][1]);
                j++;
            }

            for (int p : list)
                if (know[p])
                    know[find(p, parent)] = true;

            for (int p : list)
                know[p] |= know[find(p, parent)];

            for (int p : list)
                parent[p] = p;

            i = j;
        }

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++)
            if (know[i]) res.add(i);
        return res;
    }

    private int find(int x, int[] p) {
        return p[x] == x ? x : (p[x] = find(p[x], p));
    }

    private void union(int a, int b, int[] p) {
        int pa = find(a, p), pb = find(b, p);
        if (pa != pb) p[pb] = pa;
    }
}