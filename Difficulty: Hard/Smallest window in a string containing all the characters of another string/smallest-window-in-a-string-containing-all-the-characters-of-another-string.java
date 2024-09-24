//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		
		while(test > 0){
		    String s = scan.next();
		    String t = scan.next();
		    
		    System.out.println(new Solution().smallestWindow(s, t));
		    test--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to find the smallest window in the string s consisting
    //of all the characters of string p.
    public static String smallestWindow(String s, String p)
    {
         int m = s.length();
        int n = p.length();
        
        int[] patFreq = new int[26];
        for (char ch : p.toCharArray()) {
            patFreq[ch-'a']++;
        }
        
        int l = 0;
        int r = 0;
        int[] win = new int[26];
        
        String res = null;
        int resLen = Integer.MAX_VALUE;
        
        while (r < m) {
            win[s.charAt(r) - 'a']++;
           
            
            while (l <= r && isValid(win, patFreq)) {
                if (r-l+1 < resLen) {
                    resLen = r-l+1;
                    res = s.substring(l, r+1);
                }
                
                win[s.charAt(l) - 'a']--;
                l++;
            }
            
            r++;
        }
        
        return (res == null) ? "-1" : res;
    }
    
    private static boolean isValid(int[] arr, int[] brr) {
        for (int i = 0 ; i < 26 ; i++) {
            if (brr[i] != 0 && brr[i] > arr[i]) {
                return false;
            }
        }
        
        return true;
        // Your code here
    }
}