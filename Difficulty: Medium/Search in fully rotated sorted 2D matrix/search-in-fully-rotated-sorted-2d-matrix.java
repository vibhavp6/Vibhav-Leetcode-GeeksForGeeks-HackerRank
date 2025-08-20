class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int rl=mat[0].length;//4
        int cl=mat.length;//3
        int [] temp=new int[rl];
        for(int i=0;i<cl;i++){
            temp=mat[i];
            Arrays.sort(temp);
            if(x>temp[0]-1 && x<temp[rl-1]+1){
                for(int j=0;j<rl;j++){
                    if(temp[j]==x){
                    return true;}
                }
            }
        }
        return false;
    }
}