class Solution {
    public void dfs(ArrayList<ArrayList<Integer>> adj, int node, boolean[] vis){
        vis[node] = true;

        for(int ngh : adj.get(node)){
            if(!vis[ngh]){
                dfs(adj, ngh, vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        int n = isConnected.length;

        for (int i = 0; i<= n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                if (isConnected[i][j] == 1){
                    adj.get(i + 1).add(j + 1);
                }
            }
        }

        int cnt = 0;
        boolean[] vis = new boolean[n + 1];

        for(int i = 1; i <= n; i++){
            if(!vis[i]){
                cnt++;
                dfs(adj, i, vis);
            }
        }

        return cnt;

    }
}