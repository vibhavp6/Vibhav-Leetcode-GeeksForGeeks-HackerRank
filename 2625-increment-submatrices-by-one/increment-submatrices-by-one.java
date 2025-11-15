class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] diff = new int[n][n];
        
        for(int[] q : queries){// diff array
            int row1 = q[0];
            int col1 = q[1];
            int row2 = q[2];
            int col2 = q[3];

            for(int i=row1;i<=row2;i++){
                diff[i][col1] += 1;
                if(col2+1 < n) diff[i][col2+1] -= 1;
            }
        }
        for(int i=0;i<n;i++){ // prefix sum row wise
            for(int j=1;j<n;j++){
                diff[i][j] += diff[i][j-1];
            }
        }

        return diff;
    }
}