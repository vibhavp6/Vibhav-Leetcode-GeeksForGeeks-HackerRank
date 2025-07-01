class Solution {
    public int possibleStringCount(String word) {
        long ans = 1;                               // flawless string
        for (int i = 0, n = word.length(); i < n; ) {
            int j = i;
            while (j < n && word.charAt(j) == word.charAt(i)) j++;
            ans += (j - i - 1);                     // L‑1 extras
            i = j;
        }
        return (int) ans;
    }
}