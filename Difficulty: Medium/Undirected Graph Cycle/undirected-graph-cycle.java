//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
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
            boolean ans = obj.isCycle(V, edges);
            System.out.println(ans ? "true" : "false");
            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends


class Solution {
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        List<List<Integer>> adj = new ArrayList<>();
        for(int i =0 ; i<V; i++){
            adj.add(new ArrayList<>());
        }
        
        for(int i = 0; i<edges.length; i++) {
                int u = edges[i][0];
                int v = edges[i][1];
                adj.get(u).add(v);
                adj.get(v).add(u);
        }
        
        boolean [] vis = new boolean[V];
        for(int i = 0; i<V; i++) {
            if(!vis[i]){
                if(bfs(adj, i, vis) == true){
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean bfs(List<List<Integer>> adj, int i, boolean[] vis){
        Queue<int[]> q = new LinkedList<>();
        
        q.add(new int[]{i, -1});
        
        vis[i] = true;
        
        while(!q.isEmpty()){
            int[] node = q.poll();
            
            int x = node[0];
            int y = node[1];
            
            for(Integer ngh : adj.get(x)){
                if(!vis[ngh]){
                    q.add(new int[]{ngh, x});
                    vis[ngh] = true;
                }
                else if(ngh != y){
                    return true;
                }
            }
        }
        
        return false;
    }
}