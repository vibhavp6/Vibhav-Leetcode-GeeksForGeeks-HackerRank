class Solution {
    public int maxKDivisibleComponents(int n, int[][] edges, int[] vals, int k) {
        if (n < 2) return 1;
        
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
        int[] degree = new int[n];
        
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
            degree[edge[0]]++;
            degree[edge[1]]++;
        }
        
        long[] nodeVals = new long[n];
        for (int i = 0; i < n; i++) nodeVals[i] = vals[i];
        Queue<Integer> leafQ = new LinkedList<>();
        for (int i = 0; i < n; i++) if (degree[i] == 1) leafQ.add(i);
        
        int compCnt = 0;
        while (!leafQ.isEmpty()) {
            int curr = leafQ.poll();
            degree[curr]--;
            long carry = 0;
            
            if (nodeVals[curr] % k == 0) compCnt++;
            else carry = nodeVals[curr];
            
            for (int nbr : graph.get(curr)) {
                if (degree[nbr] == 0) continue;
                degree[nbr]--;
                nodeVals[nbr] += carry;
                if (degree[nbr] == 1) leafQ.add(nbr);
            }
        }
        
        return compCnt;
    }
}