class Solution {
    public int substrCount(String s, int k) {
        // code here
        int n = s.length(), ans = 0;
        int[] ct = new int[26];
        for (int i = 0; i < k; i++)
            ct[s.charAt(i) - 'a']++;
        ans += getDistinctCt(ct, k);    // first k characters
        for (int i = k; i < n; i++) {   // slide window
            ct[s.charAt(i) - 'a']++;
            ct[s.charAt(i - k) - 'a']--;
            ans += getDistinctCt(ct, k);
        }
        return ans;
    }

    private int getDistinctCt(int[] ct, int k) {
        int c = 0;
        for (int i = 0; i < ct.length; i++)
            if (ct[i] > 0)
                c++;
        return (c == k - 1) ? 1 : 0;
    }
}