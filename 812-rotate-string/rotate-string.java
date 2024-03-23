class Solution {
    public boolean rotateString(String s, String goal) {
        
        /*
        String A = "abcde"
        A+A = "abcde"+"abcde" = "abcdeabcde"
        
        String B = "cdeab"
        String B1 = "abced"
        
        No matter how many rotation we do, our B will always be a substring of (A+A) and B1 will not be a substring
        */
        
        return s.length() == goal.length() && (s+s).contains(goal);
        
    }
}