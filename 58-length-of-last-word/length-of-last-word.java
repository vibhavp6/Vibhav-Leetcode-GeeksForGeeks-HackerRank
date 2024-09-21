class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        // Start from the end of the string and move backwards
        for (int i = s.length() - 1; i >= 0; i--) {
            // Ignore trailing spaces
            if (s.charAt(i) != ' ') {
                count++;
            } 
            // Break when a space is found after starting to count the last word
            else if (count > 0) {
                break;
            }
        }
        return count;
    }
}
