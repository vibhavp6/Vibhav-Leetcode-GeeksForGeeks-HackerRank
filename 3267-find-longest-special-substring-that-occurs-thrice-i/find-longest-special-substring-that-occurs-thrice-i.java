import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int maximumLength(String s) {
        // List to store all generated substrings
        List<String> subarrays = new ArrayList<>();

        // Step 1: Generate all substrings where characters are identical
        for (int i = 0; i < s.length(); i++) {
            int index = i;
            // Extend substring while characters match
            while (index < s.length() && s.charAt(index) == s.charAt(i)) {
                subarrays.add(s.substring(i, index + 1)); // Add substring to list
                index++;
            }
        }

        // Step 2: Use a HashMap to count occurrences of each substring
        Map<String, Integer> counter = new HashMap<>();
        for (String sub : subarrays) {
            counter.put(sub, counter.getOrDefault(sub, 0) + 1);
        }

        // Step 3: Find the maximum length of substrings occurring at least 3 times
        int maxLen = 0;
        for (Map.Entry<String, Integer> entry : counter.entrySet()) {
            String substring = entry.getKey();
            int count = entry.getValue();

            // Check if the substring occurs at least 3 times
            if (count >= 3) {
                maxLen = Math.max(maxLen, substring.length());
            }
        }

        // Step 4: If no substring meets the condition, return -1
        return maxLen == 0 ? -1 : maxLen;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example usage
        String input = "aabbbaa";
        System.out.println("Maximum length: " + solution.maximumLength(input));
    }
}
