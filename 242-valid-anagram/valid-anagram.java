class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int [] vib = new int [26];
        for (int i = 0; i<s.length(); i++) {
            vib[s.charAt(i) - 'a'] ++;
            vib [t.charAt(i) - 'a']--;
        }
        for (int c : vib) {
            if (c != 0) return false;
        }
        return true;
    }
}