class Solution {
    public int arrangeCoins(int n) {
        int left = 1, right = n;
        int ans = -1;

        while(left <= right){
            int mid =  left + (right - left) / 2;

            
            if( mid*1.0  / 2 == n*1.0 / (mid + 1)) return mid;
            if( mid*1.0  / 2 > n*1.0 / (mid + 1)){
                right = mid -1; 
            }
            else {
                ans = mid;
                left = mid+1;
            }

        }
        return ans;
    }
}