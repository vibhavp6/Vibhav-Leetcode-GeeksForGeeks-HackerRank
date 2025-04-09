//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int V = sc.nextInt();
            int E = sc.nextInt();
            int[][] edges = new int[E][2];
            for (int i = 0; i < E; i++) {
                edges[i][0] = sc.nextInt();
                edges[i][1] = sc.nextInt();
            }

            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.articulationPoints(V, edges);
            Collections.sort(ans);
            for (int val : ans) {
                System.out.print(val + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    static ArrayList<Integer> articulationPoints(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        int[] tin = new int[V];
        int[] low = new int[V];
        boolean[] vis = new boolean[V];
        boolean[] isArticulation = new boolean[V];
        int[] timer = {0};

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(i, -1, adj, vis, tin, low, timer, isArticulation);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            if (isArticulation[i]) ans.add(i);
        }
        if (ans.size() == 0) ans.add(-1);
        return ans;
    }

    static void dfs(int u, int parent, ArrayList<ArrayList<Integer>> adj, boolean[] vis, int[] tin, int[] low, int[] timer, boolean[] isArticulation) {
        vis[u] = true;
        tin[u] = low[u] = timer[0]++;
        int children = 0;
        
        for (int v : adj.get(u)) {
            if (v == parent) continue;
            if (!vis[v]) {
                dfs(v, u, adj, vis, tin, low, timer, isArticulation);
                low[u] = Math.min(low[u], low[v]);
                if (low[v] >= tin[u] && parent != -1) {
                    isArticulation[u] = true;
                }
                children++;
            } else {
                low[u] = Math.min(low[u], tin[v]);
            }
        }
        if (parent == -1 && children > 1) {
            isArticulation[u] = true;
        }
    }
}