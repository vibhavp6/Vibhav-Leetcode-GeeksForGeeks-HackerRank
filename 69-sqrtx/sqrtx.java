class Solution {
    public int mySqrt(int x) {
    
        long left = 0, right = x;
        
        while (left <= right) {
            long mid = (left + right) / 2;

            if(mid * mid == x){
                return (int)mid;
            }

            if(mid * mid > x){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
            
        }
        
        return (int)right;
    }
}