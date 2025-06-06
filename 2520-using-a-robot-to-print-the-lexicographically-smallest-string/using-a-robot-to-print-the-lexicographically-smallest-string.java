class Solution {
    public String robotWithString(String s) {
        int[] count = new int[26];
        int min = 0;
        StringBuilder output = new StringBuilder();
        StringBuilder buffer = new StringBuilder();

        for (char ch : s.toCharArray()) count[ch - 'a']++;

        while (min < 26 && count[min] == 0) min++;

        for (char ch : s.toCharArray()) {
            if (ch - 'a' == min) {
                output.append(ch);
                if (--count[ch - 'a'] == 0) {
                    while (min < 26 && count[min] == 0) min++;
                    while (
                        min < 26 &&
                        buffer.length() > 0 &&
                        buffer.charAt(buffer.length() - 1) <= min + 'a'
                    ) {
                        output.append(buffer.charAt(buffer.length() - 1));
                        buffer.deleteCharAt(buffer.length() - 1);
                    }
                }
            } else {
                buffer.append(ch);
                count[ch - 'a']--;
            }
        }

        buffer.reverse();
        output.append(buffer);
        return output.toString();
    }
}