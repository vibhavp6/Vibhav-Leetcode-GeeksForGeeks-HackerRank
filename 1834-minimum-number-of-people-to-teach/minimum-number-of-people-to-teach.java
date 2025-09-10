import java.util.*;
class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        Set<Integer> need = new HashSet<>();
        
        for (int[] p : friendships) {
            int u = p[0] - 1, v = p[1] - 1;
            boolean ok = false;
            for (int x : languages[u]) {
                for (int y : languages[v]) {
                    if (x == y) {
                        ok = true;
                        break;
                    }
                }
                if (ok) break;
            }
            if (!ok) {
                need.add(u);
                need.add(v);
            }
        }
        
        int ans = languages.length + 1;
        for (int i = 1; i <= n; ++i) {
            int cans = 0;
            for (int v : need) {
                boolean found = false;
                for (int c : languages[v]) {
                    if (c == i) {
                        found = true;
                        break;
                    }
                }
                if (!found) cans++;
            }
            ans = Math.min(ans, cans);
        }
        return ans;
    }
}