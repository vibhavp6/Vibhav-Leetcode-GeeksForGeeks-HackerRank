class Solution {
    public int searchInsertK(int arr[], int k) {
        // code here
        int n=arr.length;
        int idx=-1;
        for(int i=0;i<n;i++){
            if(i==0 && arr[i]>k){
                idx=i;
                break;
            }else if(i-1>=0 && arr[i]>k && arr[i-1]<k){
                idx=i;
                break;
            }else if(arr[i]==k){
                idx=i;
                break;
            }else if(i==n-1 && arr[i]<k){
                idx=i+1;
                break;
            }
        }
        
        return idx;
    }
};