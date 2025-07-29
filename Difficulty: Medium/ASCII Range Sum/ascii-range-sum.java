class Solution {
    public ArrayList<Integer> asciirange(String s) 
    {
        ArrayList<Integer> ans = new ArrayList<>();
        int start[] = new int[26];
        int end[] = new int[26];
        Arrays.fill(start, -1);
        
        for(int i=0;i<s.length();i++) {
            if(start[s.charAt(i)-'a']==-1)  
                start[s.charAt(i)-'a']=i;
            end[s.charAt(i)-'a'] = i;
        }
        
        for(int i=0;i<26;i++) {
            int sum=0;
            
            for(int j=start[i]+1; j<end[i]; j++) {
                sum+=s.charAt(j);
            }
            
            if(sum!=0)
                ans.add(sum);
        }
        
        return ans;
    }
}