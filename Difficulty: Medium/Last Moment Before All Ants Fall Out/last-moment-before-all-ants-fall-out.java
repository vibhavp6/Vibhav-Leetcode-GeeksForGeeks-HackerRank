class Solution {
    public int getLastMoment(int n, int left[], int right[]) {
        // code here
        int l =0, r=0;
        for(int i=0;i<left.length;i++)
        {
            l = Math.max(l,left[i]);
            
        }
        for(int i=0;i<right.length;i++)
        {
              r = Math.max(r,n-right[i]);
        }
        
        return Math.max(l,r);
        
    }
}