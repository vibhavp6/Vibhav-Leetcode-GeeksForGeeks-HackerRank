class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        int []  vib = new int [256];
        int []  vibh =  new int [256];
        for (int i = 0; i<s.length(); i++) {
            char c = s.charAt(i);
            char v = t.charAt(i);
            if (vib[c] != vibh[v]) return false;

            vib[c] = i+1;
            vibh[v] = i+1;
        }
        return true;
    }
}