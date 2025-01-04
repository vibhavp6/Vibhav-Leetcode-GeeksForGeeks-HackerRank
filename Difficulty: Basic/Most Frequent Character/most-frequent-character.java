//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String line = br.readLine().trim();

            Solution obj = new Solution();

            System.out.println(obj.getMaxOccuringChar(line));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends



class Solution {
    public static char getMaxOccuringChar(String line) {
        int[] freq = new int[256];
        int max = 0;
        char maxChar = ' ';

        for (char c : line.toCharArray()) {
            freq[c]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq[i] > max) {
                max = freq[i];
                maxChar = (char) i;
            } else if (freq[i] == max && (char) i < maxChar) {
                maxChar = (char) i;
            }
        }

        return maxChar;
    }
}
