class Solution {
    public boolean isSubSeq(String s1, String s2) {
        // code here

        int i = 0, j = 0;
        
        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
            }
            j++;
        }
        
        return i == s1.length();
    }
};