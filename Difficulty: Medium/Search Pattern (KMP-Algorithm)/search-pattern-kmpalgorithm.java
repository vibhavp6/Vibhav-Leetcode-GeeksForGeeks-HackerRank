//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s, patt;
            s = sc.next();
            patt = sc.next();

            Solution ob = new Solution();

            ArrayList<Integer> res = ob.search(patt, s);
            if (res.size() == 0)
                System.out.print("[]");
            else {
                for (int i = 0; i < res.size(); i++) System.out.print(res.get(i) + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    ArrayList<Integer> search(String pat, String txt) {
       ArrayList<Integer> ans=new ArrayList<>();
        String str=pat+"$"+txt;
        
		int i=1;
		int len=0;
		int n=str.length();
		int lcs[]=new int[n];
		while(i<n) {
			if(str.charAt(i)==str.charAt(len)) {
				len++;
				lcs[i]=len;
				i++;
			}else {
				if(len>0) {
					len=lcs[len-1];
					
				}else {
					lcs[i]=0;
					i++;
				}
			}
		}
		int mm=pat.length();
		for(int k=mm;k<str.length();k++) {
			if(lcs[k]==mm){
				ans.add(k-(2*mm));
			}
		}
	    return ans;
    }
}