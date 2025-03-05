class Solution {
    public int check(long mid , int [] weights , int days) {
        int n = weights.length;
        int day = 1;
         long ans = 0;
         for (int i = 0; i<n; i++) {
            if(ans + weights[i] > mid) {
                day++;
                ans = weights[i];
            }
            else {
                ans += weights[i];
            }
             if (day>days) return 2;
         }
         return 0;
    }
    public int shipWithinDays(int[] weights, int days) {
        long left = -1 , right = -1, maxval = weights[0] , ts = 0 ,ans = -1;;
        int n = weights.length;
        for (int i = 0; i<n; i++) {
            ts+= weights[i];
            if(weights[i] > maxval) {
                maxval = weights[i];
            }
            left = maxval;
            right = ts;
        }
        while(left<=right) {
            long mid = left + (right -left)/2;
            long flg = check(mid, weights, days);
            if(flg == 2){
                left = mid+1;
            }
            else{
                ans = mid;
                right = mid -1;
            }
        }
        return (int) ans ;
    }
}