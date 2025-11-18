class Solution {
    public int countPaths(int V, int[][] e) {
        // Build adjacency list
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
        for (int[] edge : e) {
            adj.get(edge[0]).add(new int[]{edge[1], edge[2]});
            adj.get(edge[1]).add(new int[]{edge[0], edge[2]});
        }

        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.add(new int[]{0, 0});

        while (!pq.isEmpty()) {
            int[] a = pq.poll();
            if (a[1] == V - 1) {
                int c = 1;
                while (!pq.isEmpty()) {
                    if (pq.peek()[1] == V - 1 && pq.peek()[0] == a[0]) c++;
                    pq.poll();
                }
                return c;
            }
            for (int[] i : adj.get(a[1])) {
                int newDist = a[0] + i[1];
                if (newDist < dist[i[0]]) {
                    dist[i[0]] = newDist;
                    pq.add(new int[]{newDist, i[0]});
                } else if (newDist == dist[i[0]]) {
                    pq.add(new int[]{newDist, i[0]});
                }
            }
        }
        return 0;
    }
}


