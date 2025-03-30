//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            int ans = obj.maxPartitions(s);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends

class Solution {
    public int maxPartitions(String s) {
        // code here
        var cnt = 0;
        var idx = new int[26];
        for (int i = 0; i < s.length(); ++i) {
            int id = s.charAt(i) - 'a';
            idx[id] = i;
        }
        int r = -1;
        for (int i = 0; i < s.length(); ++i) {
            r = Math.max(r, idx[s.charAt(i) - 'a']);
            if (r == i)
                cnt++;
        }
        return cnt;
    }
}