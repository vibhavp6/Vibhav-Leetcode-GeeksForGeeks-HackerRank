class Solution {
    public long countOfSubstrings(String word, int k) {
        String vowels = "aeiou";  // String to identify vowels
        int left = 0, mid = 0;    // Two pointers for managing the sliding window
        int uniqueVowelCount = 0; // Count of distinct vowels in the current window
        int[] frequency = new int[6]; // Stores count of vowels and consonants
        int[] tempFrequency = new int[6]; // Helps in checking unique vowels in another subwindow
        long totalSubstrings = 0; // Stores the final count of valid substrings

        // Iterate through the string using a right pointer (i)
        for (int right = 0; right < word.length(); right++) {
            int vowelIndex = vowels.indexOf(word.charAt(right)) + 1;
            frequency[vowelIndex]++; // Increase count of current character

            // If it's a new vowel, increase unique vowel count
            if (vowelIndex > 0 && frequency[vowelIndex] == 1) {
                uniqueVowelCount++;
            }

            // Shrink window if consonant count exceeds k
            while (frequency[0] > k) {
                int leftVowelIndex = vowels.indexOf(word.charAt(left)) + 1;
                frequency[leftVowelIndex]--; // Remove leftmost character

                // If a vowel's count becomes 0, decrease uniqueVowelCount
                if (leftVowelIndex > 0 && frequency[leftVowelIndex] == 0) {
                    uniqueVowelCount--;
                }

                left++; // Move left pointer to shrink window
            }

            // Check if the window has all vowels and exactly k consonants
            if (uniqueVowelCount == 5 && frequency[0] == k) {
                if (mid < left) {
                    mid = left;
                    Arrays.fill(tempFrequency, 0); // Reset frequency tracker
                }

                // Expand the mid pointer to count valid substrings
                while (true) {
                    int midVowelIndex = vowels.indexOf(word.charAt(mid)) + 1;
                    
                    // Stop expanding if we hit a consonant or a necessary vowel count is exhausted
                    if (midVowelIndex == 0 || frequency[midVowelIndex] - tempFrequency[midVowelIndex] == 1) {
                        break;
                    }
                    
                    tempFrequency[midVowelIndex]++; // Track vowels in temp window
                    mid++;
                }

                // Add all valid substrings in the range [left, mid]
                totalSubstrings += mid - left + 1;
            }
        }

        return totalSubstrings;
    }
}