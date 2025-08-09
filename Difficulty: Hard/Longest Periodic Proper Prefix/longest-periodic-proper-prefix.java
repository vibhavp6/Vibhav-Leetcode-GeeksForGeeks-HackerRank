class Solution {
    int getLongestPrefix(String s) {
        int n = s.length();

        for (int k = n - 1; k >= 1; k--) {
            boolean valid = true;
            for (int i = k; i < n; i++) {
                if (s.charAt(i) != s.charAt(i % k)) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                return k;
            }
        }
        
        return -1;
    }
}