//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[][] edge = new int[n][2];
            for (int i = 0; i < n; i++) {
                edge[i][0] = sc.nextInt();
                edge[i][1] = sc.nextInt();
            }
            Solution obj = new Solution();
            int res = obj.minCost(edge);

            System.out.println(res);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends




class Solution {
    // Manhattan Distance between two points
    private int manhattanDist(int[] a, int[] b) {
        return Math.abs(a[0] - b[0]) + Math.abs(a[1] - b[1]);
    }

    public int minCost(int[][] houses) {
        int n = houses.length;
        boolean[] inMST = new boolean[n];
        int[] minDist = new int[n];
        Arrays.fill(minDist, Integer.MAX_VALUE);

        int totalCost = 0;

        // Min-heap to pick the edge with minimum cost
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.offer(new int[]{0, 0}); // {cost, index}

        while (!pq.isEmpty()) {
            int[] top = pq.poll();
            int cost = top[0];
            int u = top[1];

            if (inMST[u]) continue;

            totalCost += cost;
            inMST[u] = true;

            for (int v = 0; v < n; v++) {
                if (!inMST[v]) {
                    int dist = manhattanDist(houses[u], houses[v]);
                    if (dist < minDist[v]) {
                        minDist[v] = dist;
                        pq.offer(new int[]{dist, v});
                    }
                }
            }
        }

        return totalCost;
    }
}