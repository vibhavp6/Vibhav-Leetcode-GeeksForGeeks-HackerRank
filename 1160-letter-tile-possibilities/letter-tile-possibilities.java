class Solution {
    public int numTilePossibilities(String tiles) {
          int[] freq = new int[26];// Frequency array for letters A-Z
        for (char c : tiles.toCharArray()) //loop iterates over each character c in the input string tiles.
        {
            freq[c - 'A']++;
//c - 'A' converts the character c to an index.freq[c - 'A']++ increments the count of that letter.
        }
        return backtrack(freq);
    }
    private int backtrack(int[] freq) {
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                freq[i]--;
                count += 1 + backtrack(freq);
                freq[i]++;
            }
        }
        return count;
//dry run this method if not understand :)
    }
}