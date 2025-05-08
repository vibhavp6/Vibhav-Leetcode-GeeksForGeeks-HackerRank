import java.util.*;

class Solution {
    public int minTimeToReach(int[][] moveTime) {
        int n = moveTime.length, m = moveTime[0].length;
        boolean[][] vis = new boolean[n][m];
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.offer(new int[]{0, 0, 0, 0}); // {time, moves, row, col}
        vis[0][0] = true;
        int[][] dirs = {{0,1}, {1,0}, {-1,0}, {0,-1}};

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int t = curr[0], moves = curr[1], r = curr[2], c = curr[3];
            if (r == n - 1 && c == m - 1) return t;

            for (int[] d : dirs) {
                int nr = r + d[0], nc = c + d[1];
                if (nr >= 0 && nc >= 0 && nr < n && nc < m && !vis[nr][nc]) {
                    vis[nr][nc] = true;
                    int wait = Math.max(t, moveTime[nr][nc]);
                    int travel = (moves % 2 == 0) ? 1 : 2;
                    pq.offer(new int[]{wait + travel, moves + 1, nr, nc});
                }
            }
        }
        return -1;
    }
}