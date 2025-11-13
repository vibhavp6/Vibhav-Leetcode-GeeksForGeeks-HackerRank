class Solution {
    public int maxOperations(String s) {
        int res = 0, o = 0, n = s.length();
        for (int i = 0; i < n; ++i) {
            o += s.charAt(i) - '0';
            if (i > 0 && s.charAt(i) < s.charAt(i - 1)) {
                res += o;
            }
        }
        return res;
    }
}