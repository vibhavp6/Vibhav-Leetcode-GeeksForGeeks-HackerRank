class Solution {
    public int longestPalindrome(String[] words) {
        int[][] freq = new int[26][26];
        int pairCount = 0;

        for (String word : words) {
            int first = word.charAt(0) - 'a';
            int second = word.charAt(1) - 'a';

            if (freq[second][first] > 0) {
                pairCount += 4;
                freq[second][first]--;
            } else {
                freq[first][second]++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i][i] > 0) {
                pairCount += 2;
                break;
            }
        }

        return pairCount;
    }
}