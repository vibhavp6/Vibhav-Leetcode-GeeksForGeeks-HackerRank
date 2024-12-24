//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int rows = sc.nextInt();
            int columns = sc.nextInt();

            int matrix[][] = new int[rows][columns];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            int target = sc.nextInt();

            Solution x = new Solution();

            if (x.searchMatrix(matrix, target))
                System.out.println("true");
            else
                System.out.println("false");
            t--;

            System.out.println("~");
        }
    }
}
// } Driver Code Ends




class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        int m = mat.length;      // Number of rows
        int n = mat[0].length;   // Number of columns
        
        // Start from top-right corner
        int i = 0;      // Row index
        int j = n - 1;  // Column index
        
        while (i < m && j >= 0) {
            if (mat[i][j] == x) {
                return true;  // Found the element
            } else if (mat[i][j] > x) {
                j--;  // Move left if the current element is larger
            } else {
                i++;  // Move down if the current element is smaller
            }
        }
        
        return false;  // Element not found
    }
}

 