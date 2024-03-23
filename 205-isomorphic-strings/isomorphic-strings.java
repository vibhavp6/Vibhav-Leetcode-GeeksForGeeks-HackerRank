class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        
        int[] sMap = new int[256];
        int[] tMap = new int[256];
        
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            if (sMap[sChar] != tMap[tChar]) {
                return false;
            } else {
                sMap[sChar] = i + 1;
                tMap[tChar] = i + 1;
            }
                
            
            
        }
        
        return true;
    }
}
