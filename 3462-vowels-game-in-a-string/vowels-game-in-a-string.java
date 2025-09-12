class Solution {
    public boolean doesAliceWin(String s) {
        for (int i = 0; i < s.length(); i++)
            if ((0x104111 >> (s.charAt(i) - 97) & 1) != 0)
                return true;
        return false;
    }
}