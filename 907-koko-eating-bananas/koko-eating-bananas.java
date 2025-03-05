class Solution {
    public int check (long mid , int[]piles, int h){
        long temph = 0;
        for(int i = 0; i<piles.length;i++){
            temph += piles[i]/mid;
            if(piles[i]%mid != 0) {
                temph ++;
            }
            if (temph> h) return 2;
        }
        return 0;
    }
    public int minEatingSpeed(int[] piles, int h) {
        long left = 1, right = piles.length-1 , ans = -1 , maxval = piles[0];
        for (int i = 0; i<piles.length; i++) {
            if(piles[i] > maxval) {
                maxval = piles[i];
            }
            right = maxval;
        }
        while(left<=right) {
            long mid = left + (right-left)/2;
            long flagg = check(mid , piles , h);
            if(flagg == 2) {
                left = mid +1;
            }
            else {
                ans = mid;
                right = mid-1;
            }

        }
        return (int) ans;
    }
}