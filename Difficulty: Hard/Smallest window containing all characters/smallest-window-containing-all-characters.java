class Solution {
    public static String smallestWindow(String s, String p) {
        // code here
        int n=s.length();
        int m=p.length();
        Map<Character,Integer>mp=new HashMap<>();
        for(int i=0;i<m;i++)
        {
            char c=p.charAt(i);
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        int cnt=mp.size();
        int i=0;
        int j=0;
        int len=Integer.MAX_VALUE;
        int st=-1;
        while(j<n)
        {
            char c=s.charAt(j);
            if(mp.containsKey(c))
            {
                mp.put(c,mp.get(c)-1);
                if(mp.get(c)==0)cnt--;
                while(cnt==0)
                {
                    if(len>j-i+1)
                    {
                        len=j-i+1;
                        st=i;
                    }
                    char ch=s.charAt(i);
                    if(mp.containsKey(ch))
                    {
                        mp.put(ch,mp.get(ch)+1);
                        if(mp.get(ch)==1)cnt++;
                    }
                    i++;
                }
            }
            j++;
        }
        if(st==-1)return "";
        return s.substring(st,st+len);
    }
}

