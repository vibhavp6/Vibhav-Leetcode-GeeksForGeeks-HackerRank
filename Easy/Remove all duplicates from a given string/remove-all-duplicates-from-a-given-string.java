//{ Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String str = br.readLine().trim();

            String ans = new Solution().removeDuplicates(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    String removeDuplicates(String str) {
        HashMap<Character, Integer> mp = new HashMap<>();
        String res = "";
        
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!mp.containsKey(ch)) {
                res += ch;
                mp.put(ch, 1);
            }
        }
        
        return res;
    }
}

