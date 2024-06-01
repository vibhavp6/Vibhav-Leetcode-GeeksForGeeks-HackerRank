//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String s;
            s = br.readLine();

            Solution obj = new Solution();
            String res = obj.oddEven(s);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends



class Solution {
    public static String oddEven(String s) {
        // Create an array to hold the frequency of each character (a-z)
        // Index 0 is unused, as we map 'a' to 1, 'b' to 2, ..., 'z' to 26
        int[] freq = new int[27];

        // Calculate the frequency of each character in the string
        for (int i = 0; i < s.length(); i++) {
            // Calculate the position of the character in the alphabet (1-26)
            int position = s.charAt(i) - 'a' + 1;
            // Increment the frequency of the character at its corresponding position
            freq[position]++;
        }

        // Initialize sum to count qualifying characters
        int sum = 0;

        // Iterate through the frequency array from position 1 to 26
        for (int i = 1; i <= 26; i++) {
            if (freq[i] != 0) { // Check if the character has a positive frequency
                // Check if both the character's position and frequency are even
                if (i % 2 == 0 && freq[i] % 2 == 0) {
                    sum++;
                // Check if both the character's position and frequency are odd
                } else if (i % 2 != 0 && freq[i] % 2 != 0) {
                    sum++;
                }
            }
        }

        // Determine if the sum is even or odd and return the corresponding string
        return (sum % 2 == 0) ? "EVEN" : "ODD";
    }
}