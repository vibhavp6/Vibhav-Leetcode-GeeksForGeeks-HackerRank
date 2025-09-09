class Solution {
    public int assignHole(int[] mices, int[] holes) {
        // code here
        int n=mices.length;
        int ans=Integer.MIN_VALUE;
        Arrays.sort(mices);
        Arrays.sort(holes);
        for(int i=0;i<n;i++)
        {
            int curr=Math.abs(mices[i]-holes[i]);
            ans=Math.max(ans,curr);
        }
        return ans;
    }
};

