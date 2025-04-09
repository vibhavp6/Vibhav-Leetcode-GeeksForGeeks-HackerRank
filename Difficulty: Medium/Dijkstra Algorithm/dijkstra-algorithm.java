//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class iPair {
    int first, second;

    iPair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class DriverClass {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int V = Integer.parseInt(str[0]);
            int E = Integer.parseInt(str[1]);

            ArrayList<ArrayList<iPair>> adj = new ArrayList<ArrayList<iPair>>();
            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<iPair>());
            }

            int i = 0;
            while (i++ < E) {
                String S[] = read.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                int w = Integer.parseInt(S[2]);
                iPair t1 = new iPair(v, w);
                iPair t2 = new iPair(u, w);
                adj.get(u).add(t1);
                adj.get(v).add(t2);
            }

            int src = Integer.parseInt(read.readLine());

            Solution ob = new Solution();

            ArrayList<Integer> res = ob.dijkstra(adj, src);

            for (i = 0; i < V; i++) System.out.print(res.get(i) + " ");
            System.out.println();

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


/*
class iPair {
    int first, second;

    iPair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}
*/

// User function Template for Java
class Solution {
    // Function to find the shortest distance of all the vertices
    // from the source vertex src.
    ArrayList<Integer> dijkstra(ArrayList<ArrayList<iPair>> adj, int src) {
        int V = adj.size();

        int[] dist = new int[V];
        Arrays.fill(dist, (int) 1e9);

        dist[src] = 0;

        PriorityQueue<iPair> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.first));
        pq.add(new iPair(0, src));

        while (!pq.isEmpty()) {
            iPair node = pq.poll();
            int u = node.second;

            for (iPair neighbor : adj.get(u)) {
                int v = neighbor.first;
                int edgeWt = neighbor.second;

                if (dist[u] + edgeWt < dist[v]) {
                    dist[v] = dist[u] + edgeWt;
                    pq.add(new iPair(dist[v], v));
                }
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            list.add(dist[i]);
        }

        return list;
    }
}