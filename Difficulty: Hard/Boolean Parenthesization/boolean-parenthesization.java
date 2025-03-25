//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.stream.*;

class GFG {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s = br.readLine();
            Solution obj = new Solution();
            System.out.println(obj.countWays(s));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static int countWays(String s) {
        int n = s.length();
        memo = new HashMap<>();

        return solve(s,0,n-1,true);
    }
    
    static Map<String, Integer> memo ;
    
    static int solve(String s, int i, int j, boolean isTrue){
        if( i>j) return 0;
        
        if( i == j){
            if( isTrue ){
                if(s.charAt(i) == 'T' ){
                    return  1;
                 } else return 0;
            } else {
               if(s.charAt(j) == 'F' ){
                   return 1 ;
               } else return 0;
            }
        }
        
        String key = i+","+j+","+ isTrue+"";
        if(memo.containsKey(key)) return memo.get(key);
        
        int ans = 0;     
        
        for( int k = i+1; k<=j-1; k = k+2 ){
            int lT = solve(s, i, k-1, true);
            int lF = solve(s, i, k-1, false);
            int rT = solve(s, k+1, j, true);
            int rF = solve(s, k+1, j, false);
            
            if( s.charAt(k) == '&' ){
                if(isTrue) {
                    ans += (lT*rT);
                } else{
                     ans += (lT*rF) + (lF*rT) + (lF*rF);
                }
            } else if( s.charAt(k) == '|' ){
                if(isTrue) {
                     ans += (lT*rF) + (lF*rT) + (lT*rT);
                } else{
                     ans += (lF*rF);
                }
            } else if (s.charAt(k) == '^') {
                if (isTrue) {
                    ans += (lT * rF) + (lF * rT); 
                } else {
                    ans += (lT * rT) + (lF * rF);
                }
            }
        }
        
        memo.put(key,ans);
        return ans;
        
    }
}