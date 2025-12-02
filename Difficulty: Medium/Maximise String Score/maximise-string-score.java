class Solution {

    public int maxScore(String s, char[][] jumps) {
        int n = s.length();
        if (n == 0) return 0;

        // ---- Collect all unique chars and index them ----
        Set<Character> uniq = new HashSet<>();
        for (char c : s.toCharArray()) uniq.add(c);

        // also add all jump targets:
        for (char[] jp : jumps) {
            uniq.add(jp[0]);
            uniq.add(jp[1]);
        }

        int k = uniq.size();
        char[] idToChar = new char[k];
        Map<Character,Integer> charToId = new HashMap<>();

        int idx = 0;
        for (char c : uniq) {
            charToId.put(c, idx);
            idToChar[idx] = c;
            idx++;
        }

        // ---- psums for ASCII values ----
        long[] ps = new long[n + 1];
        for (int i = 0; i < n; i++) {
            ps[i + 1] = ps[i] + s.charAt(i);
        }

        // ---- prefix count per charId ----
        long[][] prefCount = new long[k][n + 1];
        for (int i = 0; i < n; i++) {
            int cid = charToId.get(s.charAt(i));
            for (int c = 0; c < k; c++) {
                prefCount[c][i + 1] = prefCount[c][i];
            }
            prefCount[cid][i + 1]++;
        }

        // ---- jump matrix ----
        boolean[][] canJump = new boolean[k][k];
        for (int c = 0; c < k; c++) canJump[c][c] = true;

        for (char[] jp : jumps) {
            int a = charToId.get(jp[0]);
            int b = charToId.get(jp[1]);
            canJump[a][b] = true;
        }

        // Pre-build adjacency lists
        int[][] jumpList = new int[k][];
        for (int c = 0; c < k; c++) {
            List<Integer> temp = new ArrayList<>();
            for (int d = 0; d < k; d++) if (canJump[c][d]) temp.add(d);
            jumpList[c] = temp.stream().mapToInt(x -> x).toArray();
        }

        long[] bestVal = new long[k];
        Arrays.fill(bestVal, Long.MIN_VALUE);

        long[] dp = new long[n + 1];

        // ---- Reverse DP ----
        for (int pos = n - 1; pos >= 0; pos--) {
            int cId = charToId.get(s.charAt(pos));
            long baseSum = ps[pos];

            long bestScore = 0;

            for (int tId : jumpList[cId]) {
                if (bestVal[tId] == Long.MIN_VALUE) continue;

                long baseCount = prefCount[tId][pos];
                long score = bestVal[tId] + baseCount * idToChar[tId] - baseSum;
                if (score > bestScore) bestScore = score;
            }

            dp[pos] = bestScore;

            long pc = prefCount[cId][pos + 1];
            long val = ps[pos + 1] + dp[pos] - pc * idToChar[cId];

            bestVal[cId] = Math.max(bestVal[cId], val);
        }

        return (int) dp[0];
    }
}

