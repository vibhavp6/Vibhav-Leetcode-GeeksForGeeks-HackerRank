class Solution {
    public boolean reorderedPowerOf2(int n) {
        String s = String.valueOf(n);
        Map<Character, Integer> mpp = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            mpp.put(c, mpp.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < 30; i++) { // max comparison till 30 bits
            int x = 1 << i; // left shift to get multiple power of 2
            String ss = String.valueOf(x);
            Map<Character, Integer> fnk = new HashMap<>();
            for (char c : ss.toCharArray()) {
                fnk.put(c, fnk.getOrDefault(c, 0) + 1);
            }
            if (fnk.equals(mpp)) {
                return true;
            }
        }
        return false;
    }
}