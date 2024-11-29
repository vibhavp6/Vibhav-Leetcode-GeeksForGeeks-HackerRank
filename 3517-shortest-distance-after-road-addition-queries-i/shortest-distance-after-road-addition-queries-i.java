

class Solution {
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        // Graph represented as an adjacency list
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // Initialize the graph with the unidirectional roads from city i to city i + 1
        for (int i = 0; i < n - 1; i++) {
            graph.get(i).add(i + 1);
        }

        int[] result = new int[queries.length];

        // Process each query
        for (int i = 0; i < queries.length; i++) {
            int u = queries[i][0];
            int v = queries[i][1];
            graph.get(u).add(v); // Add the new unidirectional road

            // Calculate the shortest path from city 0 to city n - 1 using BFS
            result[i] = bfsShortestPath(graph, n, 0, n - 1);
        }

        return result;
    }

    private int bfsShortestPath(ArrayList<ArrayList<Integer>> graph, int vertices, int source, int target) {
        int[] dist = new int[vertices];
        Arrays.fill(dist, -1); // Initialize distances as -1
        dist[source] = 0; // Distance to source is 0

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(source);

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int neighbor : graph.get(node)) {
                if (dist[neighbor] == -1) { // If not visited
                    dist[neighbor] = dist[node] + 1;
                    queue.offer(neighbor);
                    if (neighbor == target) { // Early exit if target is reached
                        return dist[neighbor];
                    }
                }
            }
        }

        return -1; // Return -1 if target is unreachable
    }
}
