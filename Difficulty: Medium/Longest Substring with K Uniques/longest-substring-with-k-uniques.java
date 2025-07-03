class Solution {
    public int longestKSubstr(String s, int k) {
        int res =-1;
        int distinctCount=0;
        int[] freq = new int[26];
        int l=0;
        for(int r=0; r<s.length(); r++){
            int index = s.charAt(r)-'a';
            freq[index]++;
            
            if(freq[index]== 1) distinctCount++;
            
            while(distinctCount > k){
                int beforeIndex = s.charAt(l)-'a';
                freq[beforeIndex]--;
                
                if(freq[beforeIndex] == 0) distinctCount--;
                
                l++;
            }
            
            if(distinctCount == k) res = Math.max(res, (r-l+1));
        }
        
        return res;
    }
}