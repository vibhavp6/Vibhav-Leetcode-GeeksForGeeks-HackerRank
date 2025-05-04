//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String str = br.readLine();

            Solution obj = new Solution();
            System.out.println(obj.findSubString(str));

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int findSubString(String str) {
        // code here
        HashSet<Character> hs=new HashSet<>();
        int n=str.length();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            hs.add(ch);
            
            
        }
        int min=n+1;
        int left=0;
        int i=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        while(i<n){
            char ch=str.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            while(hm.size()>=hs.size()){
                char cha=str.charAt(left);
                hm.put(cha,hm.get(cha)-1);
                if(hm.get(cha)==0){
                    hm.remove(cha);
                }
                min=Math.min(min,i-left+1);
                left++;
            }
            i++;
        }
        return min;
    }
}