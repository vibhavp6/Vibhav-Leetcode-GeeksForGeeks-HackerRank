
class Solution {
    public static int check (long mid, int []arr ,int k) {
        long partition = 1;
        long sum = 0;
        for(int i = 0; i<arr.length;i++){
            if (sum+arr[i] > mid) {
                partition ++;
                sum = arr[i];
            } 
            else {
              sum +=arr[i];
            }
            if (partition>k) return 1;
        }
        return 0;
    }
    public static int splitArray(int[] arr, int k) {
        // code here
        if(arr.length < k) return -1;
        long left = -1 , right = -1 , maxval = arr[0] , sum = 0 ,ans = -1;
        for (int i = 0; i<arr.length; i++){
            sum += arr[i];
            if (arr[i] > maxval) {
                maxval = arr[i];
            }
        }
        left = maxval;
        right = sum;
        while(left<=right){
            long mid  = left + (right-left)/2;
            int flag = check(mid,arr,k);
            if(flag == 1) {
                left = mid +1;
            }
            else {
                ans = mid;
                right = mid -1;
            }
        }
        return (int)ans;
    }
}