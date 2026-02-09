class Solution {
    public int findKRotation(int arr[]) {
        //thank me later
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            if(arr[i] > arr[i+1]) return i+1;
        }
        return 0;
    }
}