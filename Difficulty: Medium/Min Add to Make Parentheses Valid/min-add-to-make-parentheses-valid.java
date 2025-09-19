class Solution {
    public int minParentheses(String s) {
                int open = 0;
        int ans =0;
        for(Character c : s.toCharArray()){
            if(c=='('){
                open++;
            }
            else if(c==')'){
                if(open>0){
                    open--;
                }
                else{
                    ans++;
                }
            }
        }
        return ans+open;
        }
}


