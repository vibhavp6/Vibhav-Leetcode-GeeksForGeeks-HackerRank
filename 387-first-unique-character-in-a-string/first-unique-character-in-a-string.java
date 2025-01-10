class Solution {
    public int firstUniqChar(String s) {
     int [] freq = new int [26];
     for (int i =0; i<s.length(); i++) {
        char v = s.charAt(i);
        freq[v-'a']++;
     }   
     for (int i =0; i<s.length(); i++) {
        char p = s.charAt(i);
        if (freq[p-'a'] == 1)
        return i;
     }
     return -1;
    }
}