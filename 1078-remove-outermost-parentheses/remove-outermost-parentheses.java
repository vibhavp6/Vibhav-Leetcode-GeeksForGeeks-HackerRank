class Solution {
    public String removeOuterParentheses(String S) {
        StringBuilder res = new StringBuilder();
        int opened = 0;
        for (char c : S.toCharArray()) {
            if (c == '(' && opened++ > 0) res.append(c);
            if (c == ')' && opened-- > 1) res.append(c);
        }
        return res.toString();
    }
}