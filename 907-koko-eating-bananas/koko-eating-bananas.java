class Solution {
    public int check (int mid , int[] piles , int h) {
        int ans = 0;
        for (int i = 0; i <piles.length; i++) {
            ans +=piles[i]/mid;
            if(piles[i]%mid != 0) {
                ans += 1;
            }
            if (ans>h) return 1;
        } 
        return 0;
    } 
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1 , right = 1000000000 , ans = -1;

        while(left<=right) {
            int mid = left +(right-left)/2;
            int flg = check(mid,piles,h);
            if(flg == 1) {
                left = mid+1;
            }
            else if(flg == 0) {
                ans = mid;
                right = mid-1;
            }
        }
        return ans;
    }
}