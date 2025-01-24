class Solution {
    public boolean DFS(int i, int visited[], int pathVisited[], int check[], int graph[][]){
        visited[i]=1;
        pathVisited[i]=1;
        check[i]=0;

        for(int node : graph[i]){
            if(visited[node]==0){
                if(DFS(node,visited,pathVisited,check,graph)) return true;
            }
            else if(pathVisited[node]==1){
                return true;
            }
        }

        pathVisited[i]=0;
        check[i]=1;
        return false;
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int visited[] = new int[graph.length];
        int pathVisited[] = new int[graph.length];
        int check[] = new int[graph.length];

        for(int i=0; i<visited.length; i++){
            if(visited[i]==0){
                DFS(i,visited,pathVisited,check,graph);
            }
        }
        List<Integer> safeNodes = new ArrayList<>();
        for(int i=0; i<check.length; i++){
            if(check[i]==1){
                safeNodes.add(i);
            }
        }

        return safeNodes;


    }
}