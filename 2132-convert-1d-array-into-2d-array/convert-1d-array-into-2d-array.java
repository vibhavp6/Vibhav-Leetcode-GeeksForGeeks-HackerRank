class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        // Check if the total elements in the original array match the required elements in the 2D array
        if (m * n != original.length) {
            return new int[0][0]; // Return an empty 2D array if dimensions don't match
        }

        // Initialize a 2D array with 'm' rows and 'n' columns
        int[][] arr2D = new int[m][n];

        // Fill the 2D array with elements from the 1D array
        for (int i = 0; i < m; i++) {       
            for (int j = 0; j < n; j++) {    
                // Calculate the correct index in the 1D array and assign the value to the 2D array
                arr2D[i][j] = original[i * n + j];
            }
        }

    
        return arr2D;
    }
}