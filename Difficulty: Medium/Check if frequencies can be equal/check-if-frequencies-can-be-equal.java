class Solution {
    boolean sameFreq(String s) {
        // code here
        HashMap<Character,Integer> mm = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            mm.put(s.charAt(i),mm.getOrDefault(s.charAt(i),0)+1);
            
        }
        int mn=Integer.MAX_VALUE,mx=Integer.MIN_VALUE,mxcount=0;
        int c=0;
        
        for(Map.Entry<Character,Integer> x : mm.entrySet())
        {
            mn=Math.min(mn,x.getValue());
            mx=Math.max(mx,x.getValue());
            c++;
            
        }
        
         for(Map.Entry<Character,Integer> x : mm.entrySet())
        {
            if(x.getValue()==mx)
            mxcount++;
            
        }
        if(mn==mx-1&&mxcount==1||(mn==mx))
        return true;
        
        if(mxcount==c-1&&mn==1)
        return true;
        
        
        
        return false;
    }
}