class Solution {
    public void setZeroes(int[][] matrix) {

        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];

        // Set the row and col indices to true where 0 appears
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        // Traverse again and set those indices to 0 where row or col indices are marked true
        for(int i = 0; i <matrix.length; i++){
            for(int j =0; j <matrix[0].length; j++){
                if(row[i] || column[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
