class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n = edges.length;
        int[] dist1 = new int[n];
        Arrays.fill(dist1, -1);
        int d = 0, curr = node1;
        while (curr != -1 && dist1[curr] == -1) {
            dist1[curr] = d++;
            curr = edges[curr];
        }
        int best = Integer.MAX_VALUE, res = -1;
        boolean[] seen = new boolean[n];
        d = 0; curr = node2;
        while (curr != -1 && !seen[curr]) {
            seen[curr] = true;
            if (dist1[curr] != -1) {
                int m = Math.max(dist1[curr], d);
                if (m < best || (m == best && curr < res)) {
                    best = m;
                    res = curr;
                }
            }
            d++;
            curr = edges[curr];
        }
        return res;
    }
}