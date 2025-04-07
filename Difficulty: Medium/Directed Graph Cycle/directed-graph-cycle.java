//{ Driver Code Starts
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
            boolean ans = obj.isCyclic(V, edges);
            System.out.println(ans ? "true" : "false");
        }
        sc.close();
    }
}
// } Driver Code Ends


class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>() ; 
        int[] indegree = new int[V] ; 
        for(int i = 0 ; i < V ; i++){
            graph.add(new ArrayList<>()); 
        }
        for(int i = 0 ; i < edges.length ; i++){
            int u = edges[i][0] ; 
            int v = edges[i][1] ; 
            graph.get(u).add(v) ; 
            indegree[v]++ ;
        }
        Queue<Integer> q = new LinkedList<>() ; 
        for(int i = 0 ; i < V ; i++){
            if(indegree[i] == 0){
                q.offer(i); 
            }
        }
        List<Integer> result = new ArrayList<>() ; 
        while(!q.isEmpty()){
            int node = q.poll() ; 
            result.add(node) ;
            for(int nbr : graph.get(node)){
                indegree[nbr]-- ; 
                if(indegree[nbr] == 0){
                    q.offer(nbr) ; 
                }
            }
        }
        return result.size() != V ; 
        
    }
}