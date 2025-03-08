class Solution {
    public int characterReplacement(String s, int k) {
        int st = 0 , maxfreq = 0, ans = 0;
        HashMap<Character ,Integer> mpp = new HashMap  <>();
        for(int i =0; i<s.length() ; i++) {
            mpp.put(s.charAt(i) , mpp.getOrDefault(s.charAt(i) , 0) +1);
            maxfreq = Math.max(maxfreq,mpp.get(s.charAt(i)));

            while((i-st+1 )- maxfreq > k) {
                mpp.put(s.charAt(st) , mpp.get(s.charAt(st)) -1 );
                if(mpp.get(s.charAt(st)) == 0) mpp.remove(s.charAt(st));
                st++;
            }
            ans = Math.max(i-st+1,ans);
        }
        return ans;
    }
}