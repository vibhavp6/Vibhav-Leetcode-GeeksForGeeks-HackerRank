//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.swapNibbles(n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    /**
     * This method swaps the two nibbles of an 8-bit byte.
     *
     * @param n the input integer (0 ≤ n ≤ 255)
     * @return the integer after swapping the nibbles
     */
    static int swapNibbles(int n) {
        // Right shift the input by 4 bits to move the higher nibble to the lower nibble position.
        int rightShifted = n >> 4;
        
        // Mask the lower 4 bits (nibble) of the input and then left shift by 4 bits
        // to move the lower nibble to the higher nibble position.
        int leftShifted = (n & 0x0F) << 4;
        
        // Combine the shifted nibbles using bitwise OR operation to get the result.
        return rightShifted | leftShifted;
    }
}