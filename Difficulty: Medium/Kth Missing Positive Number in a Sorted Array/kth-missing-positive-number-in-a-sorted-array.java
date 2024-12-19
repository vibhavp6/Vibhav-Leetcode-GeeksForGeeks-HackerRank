//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.kthMissing(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public int kthMissing(int[] arr, int k) {
        int i=0;
    	int j=arr.length-1;
    	while(i<=j) {
    		int mid=(i+j)>>1;
    		if(arr[mid]-(mid+1)<k) {
    			i=mid+1;
    		}else {
    			j=mid-1;
    		}
    	}
    	if(j<0) {
    		return k;
    	}else if(j==arr.length-1) {
    		int temp=arr[j];
    		int miss=temp-(j+1);
    		int needtoadd=k-miss;
    		return temp+needtoadd;
    		
    	}else {
    		int temp=arr[j];
    		int miss=temp-(j+1);
    		int needtoadd=k-miss;
    		return temp+needtoadd;
    	}
    }
}