class Solution {
    public boolean isAnagram(String s, String t) {
        char [] vib = s.toCharArray();
        char [] vibh = t.toCharArray();
        Arrays.sort(vib);
        Arrays.sort(vibh);
        return Arrays.equals(vib,vibh); 
    }
}