class Solution {
    public int kokoEat(int[] arr, int k) {
        // code here
        
        long max=0L;
        
        for(int c:arr)
        {
            
            max=Math.max(max,(long)c);
        }
        long left=1L;
       long right=max;
        int ans=0;
        
        while(left<=right)
        {
            long mid=left+(right-left)/2L;
            
            if(check(arr,k,mid))
            {
                ans=(int)mid%1000000007;
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
        return ans;
    }
    private boolean check(int[] arr,int k,long mid)
    {
        double d=0.0;
        double m=(double)mid;
        for(int n:arr)
        {
            d+=Math.ceil(n/m);
            if(d>(double)k)
            return false;
        }
        return true;
    }
}