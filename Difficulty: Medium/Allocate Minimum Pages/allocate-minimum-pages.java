class Solution {
     public static int countStudent(int []arr,int pages){
        int n = arr.length;
        int student=1;
        long studentPages=0;
        for(int i =0;i<n;i++){
            if(studentPages+arr[i]<=pages){
                studentPages+=arr[i];
            }else{
                student++;
                studentPages=arr[i];
            }
        }
        return student;
    }
    public static int findPages(int[] arr, int k) {
        int n =arr.length;
         if(k>n){
            return -1;
        }
        int low = arr[0];  

for (int i = 1; i < arr.length; i++) {
    if (arr[i] > low) {
        low = arr[i];  
    }
}
        int high=0;
        for(int  i =0;i<n;i++){
            high+=arr[i];

        }
        while(low<=high){
            int mid=(low+high)/2;
            if(countStudent(arr, mid)>k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
        
    }
}

