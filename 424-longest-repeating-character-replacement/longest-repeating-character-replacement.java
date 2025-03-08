class Solution {
    public int characterReplacement(String s, int k) {
        int st = 0, ans = 0, maxFreq = 0;
        int n = s.length();
        Map<Character, Integer> mpp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            mpp.put(s.charAt(i), mpp.getOrDefault(s.charAt(i), 0) + 1);
            maxFreq = Math.max(maxFreq, mpp.get(s.charAt(i)));

            while (i - st + 1 - maxFreq > k) {
                mpp.put(s.charAt(st), mpp.get(s.charAt(st)) - 1);

                if (mpp.get(s.charAt(st)) == 0) {
                    mpp.remove(s.charAt(st));
                }

                st++;
            }

            ans = Math.max(ans, i - st + 1);
        }

        return ans;
    }
}
