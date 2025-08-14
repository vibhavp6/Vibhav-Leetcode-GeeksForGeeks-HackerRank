class Solution {
    public int countRevPairs(int[] arr) {
        // code here
        int n = arr.length;
         int temp[]=new int[n];
        return divide(arr,temp,0,n-1);
    }
    static int divide(int arr[],int temp[],int low,int high){
        int c=0;
        if(low<high){
            int mid=(low+high)/2;
            c=c+divide(arr,temp,low,mid);
            c=c+divide(arr,temp,mid+1,high);
            c=c+count(arr,temp,low,mid,high);
            mergeSort(arr,temp,low,mid,high);
        }return c;
    }
    
    static void mergeSort(int arr[],int temp[],int low,int mid,int high){
        int left=low;
        int right=mid+1;
        int k=low;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp[k]=arr[left];
                left++;
                k++;
            }else{
                temp[k]=arr[right];
                right++;
                k++;
            }
        }
        while(left<=mid){
            temp[k]=arr[left];
            left++;
            k++;
        }
        while(right<=high){
            temp[k]=arr[right];
            right++;
            k++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=temp[i];
        }
    }
    static int count(int arr[],int temp[],int low,int mid,int high){
        int c=0;
        int h=mid+1;
        for(int i=low;i<=mid;i++){
            while(h<=high && arr[i]>(2*arr[h])){
                h++;
            }
            c=c+h-(mid+1);
        }
        return c;
    }
}