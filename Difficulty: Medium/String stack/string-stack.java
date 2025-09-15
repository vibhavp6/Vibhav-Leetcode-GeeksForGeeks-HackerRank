public class Solution {
    public boolean stringStack(String pat, String tar) {
        int n = pat.length(), m = tar.length();
        int i = n - 1, j = m - 1;
        while (i >= 0 && j >= 0) {
            if (pat.charAt(i) == tar.charAt(j)) {
                j--;
                i--;
            } else {
                i -= 2;
            }
            if (j == -1) {
                return true;
            }
        }
        return false;
    }
}