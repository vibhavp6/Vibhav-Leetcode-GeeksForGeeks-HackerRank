class Solution {
    public ArrayList<Integer> safeNodes(int V, int[][] edges) {
        // Code here
        int n = edges.length;
        int[] outdeg = new int[V];
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] graph = (ArrayList<Integer>[]) new ArrayList[V];
        
        for(int i = 0; i < V; i++) graph[i] = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            
            graph[v].add(u);
            outdeg[u]++;
        }
        
        for(int i = 0; i < V; i++) if(outdeg[i] == 0) q.add(i);
        
        while(!q.isEmpty()){
            int rem = q.remove();
            
            ans.add(rem);
            for(int neigh : graph[rem]){
                outdeg[neigh]--;
                if(outdeg[neigh] == 0) q.add(neigh);
            }
        }
        
        return ans;
    }
}