//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().inversionCount(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        int l = 0;
        int r = arr.length-1;
        int count[] = {0};
        mergeSort(arr,l,r,count);
        return count[0];
    }
    static void mergeSort(int arr[], int l, int r,int[] count) {
        int mid = (l+r)/2;
        if(l==r){
            return;
        }
        mergeSort(arr,l,mid,count);
        mergeSort(arr,mid+1,r,count);
        conqure(arr,l,mid,r,count);
    }
    static void conqure(int[] arr,int l,int mid,int r,int[] count){
        int left = l;
        int right = mid+1;
        int i=0;
        int merge[] = new int[r-l+1];
        while(left<=mid && right<=r){
            if(arr[left]<=arr[right]){
                merge[i++] = arr[left++];
                
            }
            else{
                merge[i++] = arr[right++];
                count[0]+=(mid-left+1); // thelineisadded
            }
        }
        while(left<=mid){
            merge[i++] = arr[left++];
        }
        while(right<=r){
            merge[i++] = arr[right++];
        }
        for(int k=l,h=0;h<merge.length;h++,k++){
            arr[k] = merge[h];
        }
    }
}