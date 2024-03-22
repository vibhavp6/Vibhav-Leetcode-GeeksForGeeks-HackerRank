public class Solution {
    public String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder();
        int open = 0;

        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == '('){
                if(open > 0) sb.append(S.charAt(i));
                open++;
            } else {
                if(open > 1) sb.append(S.charAt(i));
                open--;
            }
        }

        return sb.toString();
    }
}
