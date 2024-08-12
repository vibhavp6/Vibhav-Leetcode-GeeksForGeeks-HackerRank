//{ Driver Code Starts
// Initial Template for Java

import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    public int SumofMiddleElements(int[] arr1, int[] arr2) {
        int n1=arr1.length;
        int n2=arr2.length;
        int l=0;
        int h=n1;
        while(l<=h){
            int l1=Integer.MIN_VALUE, l2=Integer.MIN_VALUE;
            int r1=Integer.MAX_VALUE, r2=Integer.MAX_VALUE;
            
            int mid1=(l+h)>>1;
            int mid2=n2-mid1;
             
            if(mid1<n1)r1=arr1[mid1];
            if(mid2<n2)r2=arr2[mid2];
             
            if(mid1-1>=0)l1=arr1[mid1-1];
            if(mid2-1>=0)l2=arr2[mid2-1];
            
            if(l1<=r2 && l2<=r1 ){
                return Math.max(l1,l2)+Math.min(r1,r2);
            }
            else if(l2>r1){
                l=mid1+1;
            }else{
                h=mid1-1;
            }
        }
        return 0;
    }
}

//{ Driver Code Starts.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume newline
        while (t-- > 0) {
            String[] input1 = sc.nextLine().split(" ");
            int[] arr = new int[input1.length];
            for (int i = 0; i < input1.length; i++) {
                arr[i] = Integer.parseInt(input1[i]);
            }

            String[] input2 = sc.nextLine().split(" ");
            int[] brr = new int[input2.length];
            for (int i = 0; i < input2.length; i++) {
                brr[i] = Integer.parseInt(input2[i]);
            }

            Solution ob = new Solution();
            int res = ob.SumofMiddleElements(arr, brr);
            System.out.println(res);
        }
    }
}

// } Driver Code Ends