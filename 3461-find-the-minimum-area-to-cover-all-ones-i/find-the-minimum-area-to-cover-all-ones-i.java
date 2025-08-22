class Solution {
    public int minimumArea(int[][] grid) {
        int rowsmin=Integer.MAX_VALUE;
        int colsmin=Integer.MAX_VALUE;
        int rowsmax=Integer.MIN_VALUE;
        int colsmax=Integer.MIN_VALUE;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    rowsmin=Math.min(rowsmin,i);
                    colsmin=Math.min(colsmin,j);
                    rowsmax=Math.max(i,rowsmax);
                    colsmax=Math.max(j,colsmax);
                }
            }
        }
        int area=(rowsmax-rowsmin+1)*(colsmax-colsmin+1);
        return area;
    }
}