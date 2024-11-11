//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u); // Added this line to make the graph undirected
            }
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.bfsOfGraph(adj);
            for (int i = 0; i < ans.size(); i++) System.out.print(ans.get(i) + " ");
            System.out.println();
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    // Function to return Breadth First Traversal of the given graph.
    public ArrayList<Integer> bfsOfGraph(ArrayList<ArrayList<Integer>> adj) {
        
        int V = adj.size(); // Get the number of vertices from the size of adj
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] vis = new boolean[V]; // 'V' is the number of vertices

        Queue<Integer> q = new LinkedList<>(); // Correct queue initialization
        
        // Start BFS from node 0
        q.add(0);
        vis[0] = true;
        
        while (!q.isEmpty()) {
            Integer node = q.poll();
            ans.add(node); // 'ans' instead of 'bfs'
            
            // Traverse all adjacent nodes of the current node
            for (Integer it : adj.get(node)) {
                if (!vis[it]) { // Check if the node has been visited
                    vis[it] = true;
                    q.add(it);
                }
            }
        }
        return ans;
    }
}