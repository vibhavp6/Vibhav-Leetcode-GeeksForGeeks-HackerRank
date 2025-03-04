class Solution {
    public int check (int mid, int [] arr ,int days) {
        int day = 1;
        long sum = 0;
        for (int i = 0; i<arr.length; i++) {
            if (sum + arr[i] > mid) {
                day++;
                sum = arr[i];
            }
            else {
                sum += arr[i];
            }
            if (day > days) return 1; 
        }
        return 0;
    }
    public int splitArray(int[] arr, int days) {
        int sumr = 0, suml = arr[0], left = -1, right = -1, ans = -1;
        for (int i = 0 ; i<arr.length; i++) {
            sumr += arr[i]; 
            if(arr[i] > suml) suml = arr[i];
        }
        right = sumr;
        left = suml;


        while (left<=right) {
            int mid = left + (right-left)/2;
            int flg = check(mid,arr,days);

            if(flg == 1) {
                left = mid+1;
            }
            else {
                ans = mid;
                right = mid-1;
            }
        }
        return ans;
    }
}