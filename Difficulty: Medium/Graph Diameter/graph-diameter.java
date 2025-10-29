class Solution {
    class Node{
        int vertex;
        int dist;
        Node(int vertex, int dist){
            this.vertex = vertex;
            this.dist = dist;
        }
    }
    public int[] farthest(int start, ArrayList<Integer>[] graph, int V){
        int farthest = start; // initially
        int maxDist = 0; // initially
        Queue<Node> q = new LinkedList<>(); // for bfs
        boolean[] isVisited = new boolean[V]; // to mark visited
        
        q.offer(new Node(start, 0)); // start bfs
        isVisited[start] = true; // mark visited
        
        while(!q.isEmpty()){
            Node curr = q.poll();
            if(curr.dist>maxDist){
                maxDist = curr.dist; // update mac dist
                farthest = curr.vertex; // and farthest node
            }
            for(int neighbour : graph[curr.vertex]){
                // expore other neighbours
                if(!isVisited[neighbour]){
                    isVisited[neighbour] = true;
                    q.offer(new Node(neighbour, curr.dist+1));
                }
            }
        }
        return new int[]{farthest, maxDist}; // farthest node and max dist from start
    }
    public int diameter(int V, int[][] edges) {
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] graph = new ArrayList[V]; // adjacency list
        for(int i=0; i<V; i++){
            graph[i] = new ArrayList<>();
        }
        
        for(int i=0; i<edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            graph[u].add(v); // u->v
            graph[v].add(u); // v-u
        }
        
        // Note :-
        // 1. If you choose a random node u, and find the farthest node v from u, then this node v will always be the one end on diameter.
        // 2. Farthest node from one end of diameter will be the other end of diameter.
        
        int farthestFrom0 = farthest(0, graph, V)[0]; // farthest from node 0
        
        int diameter = farthest(farthestFrom0, graph, V)[1]; // diameter from (farthestFrom 0);
        
        return diameter;
    }
}