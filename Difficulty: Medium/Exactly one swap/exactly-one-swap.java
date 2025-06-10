class Solution {
    public int countStrings(String s) {
        int n = s.length();
        long totalSwaps = (long) n * (n - 1) / 2;

        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        long duplicateSwaps = 0;
        boolean hasDuplicateChar = false;
        for (int f : freq) {
            if (f > 1) {
                hasDuplicateChar = true;
                duplicateSwaps += (long) f * (f - 1) / 2;
            }
        }
        long distinct = totalSwaps - duplicateSwaps;

        if (hasDuplicateChar) {
            distinct += 1;
        }

        return (int) distinct;
    }
}