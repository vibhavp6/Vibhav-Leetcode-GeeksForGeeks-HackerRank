class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        //First element is always mat[0][0]
        //Second element, if it extists, is mat[0][1]
        //Then, from [0][1], go -1,-1 until wall is hit
        //if possible, go down one
        //then, go +1,+1 until next wall
        //Else if possible, go right one, then +1,+1
        //Else done

        if(mat.length == 1){ //if mat is single row/element
            return mat[0];
        }

        int total = mat.length*mat[0].length; //how many elements in mat

        int[] ret = new int[total]; //return value

        ret[0] = mat[0][0]; //first element of ret is always mat[0][0]
        
        if(mat[0].length == 1){ //if mat is single column
            for(int i=1; i<mat.length; i++){
                ret[i] = mat[i][0];
            }
            return ret;
        }

        int count = 1;
        int i = 0; int j=1;
        boolean downLeft = true;

        while(count < total){
            if(downLeft){
                while(j>0 && i<mat.length-1){
                    ret[count] = mat[i][j];
                    count++;
                    i++;
                    j--;
                }

                ret[count] = mat[i][j];
                count++;                

                if(i<mat.length-1){
                    i++;
                }else{
                    j++;
                }
                downLeft = false;
            }else{
                while(i>0 && j<mat[0].length-1){
                    ret[count] = mat[i][j];
                    count++;
                    i--;
                    j++;
                }

                ret[count] = mat[i][j];
                count++;

                if(j<mat[0].length-1){

                    j++;
                }else{
                    i++;
                }

                downLeft = true;
            }
        }

        return ret;
    }
}