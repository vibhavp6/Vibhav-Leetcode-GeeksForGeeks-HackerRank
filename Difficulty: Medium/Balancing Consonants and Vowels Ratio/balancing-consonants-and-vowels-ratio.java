class Solution {
    boolean isvowel(char ch)
    {
        return (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u');
    }
    public int countBalanced(String[] arr) {
        // code here
        int n=arr.length;
        Map<Integer,Integer>mp=new HashMap<>();
        mp.put(0,1);
        int sum=0;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            int curr=0;
            String str=arr[i];
            for(int j=0;j<str.length();j++)
            {
                char ch=str.charAt(j);
                if(isvowel(ch))curr++;
                else curr--;
            }
            sum+=curr;
            if(mp.containsKey(sum))ans+=mp.get(sum);
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}