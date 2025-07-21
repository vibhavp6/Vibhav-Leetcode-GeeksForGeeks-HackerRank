//\U0001d4df\U0001d4f5\U0001d4ee\U0001d4ea\U0001d4fc\U0001d4ee \U0001d4e4\U0001d4df\U0001d4e5\U0001d4de\U0001d4e3\U0001d4d4 \U0001d4f2\U0001d4ef \U0001d4f2\U0001d4fd \U0001d4f1\U0001d4ee\U0001d4f5\U0001d4f9\U0001d4fc\U0001f44d\U0001f3fb
class Solution {
    public String makeFancyString(String s) {
        char[] chars = s.toCharArray();
        char last = chars[0];
        int count = 1;
        int pos = 1;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != last) {
                last = chars[i];
                count = 0;
            }

            if (++count > 2) continue;

            chars[pos++] = chars[i];
        }

        return new String(chars, 0, pos);
    }
}