class Solution {
    public int vowelCount(String s) {
        // code here
        Set<Character> set=new HashSet<>();
        buildSet(set);
        
        Map<Character,Integer> mp=new HashMap<>();
        for(char c:s.toCharArray())
        {
            if(set.contains(c))
            {
                 mp.put(c,mp.getOrDefault(c,0)+1);
            }
           
        }
        int fact=mp.size();
       // System.out.println(fact);
        
        for(int i=fact-1;i>0;i--)
        {
            fact*=i;
        }
        int ans=1;
        
        for(char c:mp.keySet())
        {
            ans*=mp.get(c);
        }
        
        return ans*fact;
    }
    
    public void buildSet(Set<Character> s)
    {
        s.add('a');
        s.add('e');
        s.add('i');
        s.add('o');
        s.add('u');
    }
}