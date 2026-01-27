class Solution {

  private static final int INF = Integer.MAX_VALUE / 2;

  public int minCost(int n, int[][] edges) {

      // Build adjacency list
      List<List<int[]>> graph = new ArrayList<>();
      for (int i = 0; i < n; i++) {
          graph.add(new ArrayList<>());
      }

      // Add asymmetric edges
      for (int[] e : edges) {
          int u = e[0], v = e[1], w = e[2];
          graph.get(u).add(new int[]{v, w});
          graph.get(v).add(new int[]{u, w * 2});
      }

      // Distance array
      int[] dist = new int[n];
      Arrays.fill(dist, INF);
      dist[0] = 0;

      // Min-heap for Dijkstra
      PriorityQueue<int[]> pq = new PriorityQueue<>(
          (a, b) -> Integer.compare(a[0], b[0])
      );

      pq.offer(new int[]{0, 0}); // {distance, node}

      while (!pq.isEmpty()) {
          int[] cur = pq.poll();
          int d = cur[0], node = cur[1];

          if (d > dist[node]) continue;

          for (int[] edge : graph.get(node)) {
              int next = edge[0], cost = edge[1];
              if (dist[next] > d + cost) {
                  dist[next] = d + cost;
                  pq.offer(new int[]{dist[next], next});
              }
          }
      }

      return dist[n - 1] >= INF ? -1 : dist[n - 1];
  }
}
