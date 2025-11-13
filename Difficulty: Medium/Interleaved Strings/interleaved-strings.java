import java.io.*;
import java.util.*;

public class Solution {
    public static boolean isInterleave(String s1, String s2, String s3) {
        int n1 = s1.length(), n2 = s2.length(), n3 = s3.length();
        if (n1 + n2 != n3) return false;

        boolean[][] dp = new boolean[n1 + 1][n2 + 1];
        dp[0][0] = true;

        // Fill first column: using characters from s1 only
        for (int i = 1; i <= n1; i++) {
            dp[i][0] = dp[i - 1][0] && s1.charAt(i - 1) == s3.charAt(i - 1);
        }

        // Fill first row: using characters from s2 only (BUG FIX: dp[0][j], not dp[j][0])
        for (int j = 1; j <= n2; j++) {
            dp[0][j] = dp[0][j - 1] && s2.charAt(j - 1) == s3.charAt(j - 1);
        }

        // Fill the rest
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                char c = s3.charAt(i + j - 1);
                dp[i][j] = (dp[i - 1][j] && s1.charAt(i - 1) == c) ||
                           (dp[i][j - 1] && s2.charAt(j - 1) == c);
            }
        }

        return dp[n1][n2];
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> lines = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            line = line.trim();
            if (!line.isEmpty()) lines.add(line);
        }

        if (lines.isEmpty()) return;

        int idx = 0;
        int total = lines.size();
        int t = 0;

        // Try to detect a leading integer indicating number of test cases
        try {
            int possibleT = Integer.parseInt(lines.get(0));
            // if there are exactly 1 + 3*possibleT lines (or at least that many), treat first as count
            if (total >= 1 + 3 * possibleT) {
                t = possibleT;
                idx = 1;
            } else {
                // not enough lines for that interpretation; fall back to grouping by 3
                idx = 0;
                t = total / 3;
            }
        } catch (NumberFormatException e) {
            idx = 0;
            t = total / 3;
        }

        // Process t testcases starting at idx
        StringBuilder sb = new StringBuilder();
        for (int tc = 0; tc < t; tc++) {
            int base = idx + tc * 3;
            if (base + 2 >= total) break; // safety
            String s1 = lines.get(base);
            String s2 = lines.get(base + 1);
            String s3 = lines.get(base + 2);
            boolean res = isInterleave(s1, s2, s3);
            sb.append(res ? "true" : "false");
            if (tc < t - 1) sb.append(System.lineSeparator());
        }

        System.out.print(sb.toString());
    }
}