class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        // code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        for(int i = 0; i < mat.length; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j = 0; j < mat[0].length; j++){
                temp.add(mat[j][i]);
            }
            list.add(temp);
        }
        
        return list;
    }
}
