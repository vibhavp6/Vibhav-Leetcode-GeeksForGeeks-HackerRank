import java.util.*;

class Solution {
    private void build(List<List<Integer>> adj, int[][] edges) {
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
    }

    private void get(int[] p, List<List<Integer>> adj, int node, int dis, boolean[] vis) {
        int d = p[1];
        vis[node] = true;
        if (dis > d) {
            p[0] = node;
            p[1] = dis;
        }
        for (int neighbor : adj.get(node)) {
            if (!vis[neighbor]) {
                get(p, adj, neighbor, dis + 1, vis);
            }
        }
    }

    public int minimumDiameterAfterMerge(int[][] edges1, int[][] edges2) {
        int n = edges1.length + 1;
        int m = edges2.length + 1;
        List<List<Integer>> adj1 = new ArrayList<>();
        List<List<Integer>> adj2 = new ArrayList<>();
        for (int i = 0; i < n; i++) adj1.add(new ArrayList<>());
        for (int i = 0; i < m; i++) adj2.add(new ArrayList<>());

        build(adj1, edges1);
        build(adj2, edges2);

        int[] p1 = new int[]{-1, Integer.MIN_VALUE};
        boolean[] vis = new boolean[n];
        get(p1, adj1, 0, 0, vis);

        int[] p2 = new int[]{-1, Integer.MIN_VALUE};
        Arrays.fill(vis, false);
        get(p2, adj1, p1[0], 0, vis);
        int d1 = p2[1];

        p1 = new int[]{-1, Integer.MIN_VALUE};
        vis = new boolean[m];
        get(p1, adj2, 0, 0, vis);

        p2 = new int[]{-1, Integer.MIN_VALUE};
        Arrays.fill(vis, false);
        get(p2, adj2, p1[0], 0, vis);
        int d2 = p2[1];

        if (edges1.length == 0) d1 = 0;
        if (edges2.length == 0) d2 = 0;

        return Math.max(Math.max(d1, d2), (d1 + 1) / 2 + (d2 + 1) / 2 + 1);
    }
}