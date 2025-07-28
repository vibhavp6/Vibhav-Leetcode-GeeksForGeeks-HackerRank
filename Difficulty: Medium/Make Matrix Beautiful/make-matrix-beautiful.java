class Solution {
    public static int balanceSums(int[][] mat) {
        // code here
        int maxi = Integer.MIN_VALUE; // ooverall max in all cols and rows.
        for(int i=0;i<mat.length;i++){
            int sum = 0;
            for(int j=0;j<mat[i].length;j++){
                sum += mat[i][j];
            }
            
            maxi = Math.max(maxi , sum);// for max sum for each row.
            
            sum = 0;
            for(int j=0;j<mat[i].length;j++){
                sum += mat[j][i];
            }
            
            maxi = Math.max(maxi , sum); // for max sum for each col.
        }
        
        
        int row[]  = new int[mat.length];
        int col[]  = new int[mat.length];
        
        for(int i=0;i<mat.length;i++){
            int sum = 0;
            
            for(int j=0;j<mat[i].length;j++){
                sum += mat[i][j];
            }
            
            row[i] = maxi - sum;// maximum sum needed for each row.
            
            sum = 0;
            for(int j=0;j<mat[i].length;j++){
                sum += mat[j][i];
            }
            
            col[i] = maxi - sum;// maximum sum needed for each col.
        }
        
        
        int totalCol = 0;// total amount needed to balance all the cols.
        for(int i=0;i<mat.length;i++){
            totalCol += col[i];
        }
        
        int res = 0;
        
        for(int i=0;i<mat.length;i++){
            res += Math.min(totalCol , row[i]);
        }
        return res;
    }
}

 