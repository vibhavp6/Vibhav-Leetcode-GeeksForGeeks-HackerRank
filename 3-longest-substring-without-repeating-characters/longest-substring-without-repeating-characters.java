class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character , Integer> ans = new HashMap<>();
        int st = 0; 
        int length = 0;
        for (int i = 0; i<s.length(); i++) {
            ans.put(s.charAt(i) , ans.getOrDefault(s.charAt(i) , 0) +1) ;
            while(ans.get(s.charAt(i))>1){
                ans.put(s.charAt(st) , ans.get(s.charAt(st)) -1);
                if(ans.get(s.charAt(st)) ==0){
                    ans.remove(s.charAt(st));
                }
                st++;
            }
            length = Math.max(length,i-st+1);
        }
        return length;
        
    }
}