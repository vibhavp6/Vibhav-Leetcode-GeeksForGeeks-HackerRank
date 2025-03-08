class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character> mpp =new HashSet<>();
        mpp.add('a');
        mpp.add('e');
        mpp.add('i');
        mpp.add('o');
        mpp.add('u');
        int st= 0;
        int ans = 0;
        int count =0;

        for(int i=0; i<s.length(); i++) {
            if(mpp.contains(s.charAt(i))){
                count++;
            }
            if(i-st+1 == k) {
                ans = Math.max(ans,count);
               if(mpp.contains(s.charAt(st))){
                    count--;
                }
                st++;
            }
        }
        return ans;
    }
}