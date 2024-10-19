//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {

    String roundToNearest(String str) {
        // Complete the function
        	int n=str.length();
	   	if(n==1) {
	   		int temp=str.charAt(0)-'0';
	   		if(temp>5)return "10";
	   		else return "0";
	   		
	   	}
		   if(str.charAt(n-1)-'0'>5) {
			   String ans="0";
			   int keep=1;
			   for(int i=n-2;i>=0;i-- ) {
				   int temp=str.charAt(i)-'0';
				   if(temp+keep>9) {
					   int rem=(temp+keep)%10;
					   ans=rem+""+ans;
					   keep=1;
				   }else {
					   int rem=(temp+keep)%10;
					   ans=rem+""+ans;
					   keep=0;
				   }
			   }
			   
			   	if(keep!=0) {
				   ans="1"+ans;
			   }
			   
			   return ans;
		   }else {
			   return str.substring(0,n-1)+"0";
		   } 
    }
}


//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());

        // looping through all testcases
        while (testcases-- > 0) {

            String str = br.readLine().trim();

            Solution obj = new Solution();

            String res = obj.roundToNearest(str);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends