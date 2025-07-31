class Solution {
    public int powerfulInteger(int[][] intervals, int k) {
        // code here
        int n=intervals.length;
        
        int max=intervals[0][1];
        for(int i=0;i<n;i++)
        {
            max=Math.max(intervals[i][1],max);
        }
        
        int freq[]=new int[max+1];
        for(int i=0;i<n;i++)
        {
            int l=intervals[i][0];
            int r=intervals[i][1];
            freq[l]+=1;
            if(r+1<=max)freq[r+1]-=1;
        }
        
        int ans=-1;
        for(int i=1;i<=max;i++)
        {
            freq[i]=freq[i]+freq[i-1];
            if(freq[i]>=k)ans=Math.max(ans,i);
        }
        return ans;
    }
}