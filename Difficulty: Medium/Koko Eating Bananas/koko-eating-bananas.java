class Solution {
    public static boolean canFinish(int[] arr, int k, int s){
        int hours=0;
        for(int val:arr){
            hours+=(val+s-1)/s;
        }
        return hours<=k;
    }
     public static int getmax(int[] arr){
          int max=arr[0];
          for(int val:arr){
              if(val>max){
                  max=val;
              }
          }
          return max;
     }
    public int kokoEat(int[] arr, int k) {
        // code here
        int left=1;
        int right=getmax(arr);
        int answer=right;
      while(left<=right){
          int mid=left+(right-left)/2;
          if(canFinish(arr,k,mid)){
              answer=mid;
              right=mid-1;
          }
          else{
              left=mid+1;
          }
      }
      return answer;
      }
}

