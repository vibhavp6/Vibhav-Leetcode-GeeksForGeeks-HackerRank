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
        int[] parent = new int[V];
        for(int i=0; i<V; i++){
            parent[i] = i;
        }
        
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            int parentU = find(parent, u);
            int parentV = find(parent, v);
            
            if(parentU == parentV){
                return true;
            }
            union(parent, parentU, parentV);
        }
        return false;
    }
    
    private int find(int[] parent, int vertex){
        if(parent[vertex] != vertex){
            parent[vertex] = find(parent, parent[vertex]);
        }
        return parent[vertex];
    }
    
    private void union(int[] parent, int u, int v){
        parent[u] = v;
    }
}