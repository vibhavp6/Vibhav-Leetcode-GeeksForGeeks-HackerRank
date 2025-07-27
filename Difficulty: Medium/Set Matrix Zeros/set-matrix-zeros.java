class Solution {
    public void setMatrixZeroes(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        
        // Variables to track if first row and first column should be zeroed
        boolean firstRowZero = false;
        boolean firstColZero = false;
        
        // Check if first row has any zero
        for (int j = 0; j < m; j++) {
            if (mat[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }
        
        // Check if first column has any zero
        for (int i = 0; i < n; i++) {
            if (mat[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }
        
        // Use first row and first column as markers
        // Traverse the matrix from (1,1) to (n-1,m-1)
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (mat[i][j] == 0) {
                    // Mark the corresponding first row and first column
                    mat[i][0] = 0;  // Mark first column
                    mat[0][j] = 0;  // Mark first row
                }
            }
        }
        
        // Set zeros based on markers in first row and first column
        // Traverse from (1,1) to (n-1,m-1)
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (mat[i][0] == 0 || mat[0][j] == 0) {
                    mat[i][j] = 0;
                }
            }
        }
        
        // Handle first row
        if (firstRowZero) {
            for (int j = 0; j < m; j++) {
                mat[0][j] = 0;
            }
        }
        
        // Handle first column
        if (firstColZero) {
            for (int i = 0; i < n; i++) {
                mat[i][0] = 0;
            }
        }
    }
}

