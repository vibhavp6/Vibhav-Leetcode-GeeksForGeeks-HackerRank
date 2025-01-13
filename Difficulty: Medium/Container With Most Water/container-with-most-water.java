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
            System.out.println(new Solution().maxWater(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    public int maxWater(int arr[]) {
        // Code Hereint maxWater(vector<int> &arr) {
        // code here
         if(arr.length==1){
            return 0;
        }
        int i=0;int j=arr.length-1;
        int res=0;
        while(i<j){
            int area=Math.min(arr[i],arr[j])*(j-i);
            res=Math.max(res,area);
            if(arr[i]>arr[j]){
                j--;
            }else if(arr[i]<arr[j]){
                i++;
            }else{
                i++; j--;
            }
        }
        
        return res;
    }
}