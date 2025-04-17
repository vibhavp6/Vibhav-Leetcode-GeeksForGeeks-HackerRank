//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            int V = Integer.parseInt(sc.nextLine());
            int E = Integer.parseInt(sc.nextLine());

            List<int[]> edgeList = new ArrayList<>();

            for (int i = 0; i < E; i++) {
                String[] parts = sc.nextLine().split(" ");
                int u = Integer.parseInt(parts[0]);
                int v = Integer.parseInt(parts[1]);
                int w = Integer.parseInt(parts[2]);
                edgeList.add(new int[] {u, v, w});
                edgeList.add(new int[] {v, u, w});
            }

            int[][] edges = new int[edgeList.size()][3];
            for (int i = 0; i < edgeList.size(); i++) {
                edges[i] = edgeList.get(i);
            }

            Solution obj = new Solution();
            int res = obj.findMinCycle(V, edges);

            System.out.println(res);
        }

        sc.close();
    }
}

// } Driver Code Ends


class Pair implements Comparable<Pair> {
    int node, weight;
    Pair(int node, int weight) {
        this.node = node;
        this.weight = weight;
    }
    
    static Pair of(int node, int weight) {
        return new Pair(node, weight);
    }
    
    @Override
    public int hashCode() {
        return this.node * 31 + this.weight;
    }
    
    @Override
    public boolean equals(Object o) {
        if(o == null) return false;
        
        if(!(o instanceof Pair)) return false;
        
        Pair p = (Pair)o;
        
        return this.node == p.node && this.weight == p.weight;
        
    }
    
    @Override
    public int compareTo(Pair p) {
        return this.weight - p.weight;
    }
}

class Solution {
    
    private int dijkstra(int src, int dest, int V, List<Set<Pair>> adj) {
        int dist[] = new int[V];
        int MAX = 100000000;
        Arrays.fill(dist, MAX);
        
        dist[src] = 0;
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        pq.add(Pair.of(src, 0));
        
        while(!pq.isEmpty()) {
            Pair p = pq.poll();
            for(Pair nei : adj.get(p.node)) {
                if(dist[nei.node] > dist[p.node] + nei.weight) {
                    dist[nei.node] = dist[p.node] + nei.weight;
                    pq.add(Pair.of(nei.node, dist[nei.node]));
                }
            }
        }
        
        return dist[dest];
        
    }
    
    public int findMinCycle(int V, int[][] edges) {
        // code here
        List<Set<Pair>> adj = new ArrayList<>();
        
        for(int i=0; i<V; i++) {
            adj.add(new HashSet<>());
        }
        
        for(int edge[] : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            adj.get(u).add(Pair.of(v, w));
            adj.get(v).add(Pair.of(u, w));
        }
        
        int ans = Integer.MAX_VALUE;
        
        // Remove each edge and check the min weight of cycle
        for(int edge[] : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            
            // Remove edge
            adj.get(u).remove(Pair.of(v, w));
            adj.get(v).remove(Pair.of(u, w));
            
            int minDist = dijkstra(u, v, V, adj);
            if(minDist + w < ans) {
                ans = minDist + w;
            }
            
            // Add edge back
            adj.get(u).add(Pair.of(v, w));
            adj.get(v).add(Pair.of(u, w));
            
        }
        
        return ans;
        
        
    }
};