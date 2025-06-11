class Solution {
    public int findLength(int[] color, int[] radius) {
        Stack<Integer> res = new Stack<>();
        int n = color.length;
        
        for(int i=0; i<n; i++){
            if(!res.isEmpty()){
                if(color[i]==color[res.peek()] && radius[i]==radius[res.peek()]){
                    res.pop();
                }else{
                    res.push(i);
                }
            }else{
                res.push(i);
            }
        }
        return res.size();
    }
}