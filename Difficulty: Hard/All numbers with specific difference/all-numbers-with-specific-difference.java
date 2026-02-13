class Solution {
    public int getCount(int n, int d) {
        // code here
        int low=1;
        int high=n;
        // int ans=n+1;

        while(low<=high)
        {
            int mid=(low+high)/2;
            
            if(compute(mid,n,d))
            {
               
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
       return n-high;
    }
    public boolean compute(int mid, int n, int d)
    {
        int digit_sum=0;
        int digi=mid;
        while(mid>0)
        {
            digit_sum+=mid%10;
            mid=mid/10;
        
        }
        if(digi-digit_sum>=d)
        {
            return true;
        }
        return false;
    }
};