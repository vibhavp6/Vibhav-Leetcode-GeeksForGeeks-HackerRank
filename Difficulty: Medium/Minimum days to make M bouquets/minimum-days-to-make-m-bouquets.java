class Solution {
    public static boolean possible(int bloomDay[], int day, int M ,int K){
        int n  = bloomDay.length;
        int count = 0;
        int countB = 0;
        for(int i=0;i<n;i++){
            if(bloomDay[i] <= day){
                count++;
            } else {
                countB += (count / K);
                count = 0;
            }
        }
        countB += (count / K);
        return countB >= M;
    }

    public int minDaysBloom(int[] bloomDay, int k, int m) {
        int n = bloomDay.length;
        long val = (long)m * k;
        if(val > n){
            return -1;
        }
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            low = Math.min(low, bloomDay[i]);
            high = Math.max(high, bloomDay[i]);
        }
        // Binary Search
        while(low <= high){
            int mid = (low + high) / 2;
            if(possible(bloomDay, mid, m, k)){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
