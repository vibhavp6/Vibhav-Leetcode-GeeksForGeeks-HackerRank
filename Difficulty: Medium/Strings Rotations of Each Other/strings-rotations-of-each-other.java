class Solution {
    public boolean areRotations(String s1, String s2) {
        // code here
        s1 = s1 + s1;
        int i = 0;
        int j = 0;
        while(i < s1.length() && j < s2.length()){
            if(s1.charAt(i) == s2.charAt(j)){
                j++;
            }
            i++;
        }
        if(j == s2.length()) return true;
        return false;
    }
}