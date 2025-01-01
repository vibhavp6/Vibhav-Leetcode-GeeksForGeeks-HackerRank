class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder(); 
        int v = word1.length();
        int p = word2.length();
        int mac = Math.max(v, p);

        for (int i = 0; i < mac; i++) {
            if (i < v) {
                ans.append(word1.charAt(i)); 
            }
            if (i < p) {
                ans.append(word2.charAt(i));
            }
        }

        return ans.toString(); 
    }
}
