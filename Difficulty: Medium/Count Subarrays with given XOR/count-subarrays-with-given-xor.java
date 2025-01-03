//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {
            String s[] = br.readLine().split(" ");
            int arr[] = new int[s.length];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(s[i]);
            }
            int k = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            System.out.println(obj.subarrayXor(arr, k));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends

class Solution {
    public long subarrayXor(int arr[], int k) {
        long n=arr.length;
        long prefixxor=0;
        long cnt=0;
        HashMap<Long,Long>map=new HashMap<>();
        map.put(0L,1L);
        for(int i=0;i<n;i++){
            prefixxor^=arr[i];
            long target=prefixxor^k;
            cnt+=map.getOrDefault(target,0L);
            map.put(prefixxor,map.getOrDefault(prefixxor,0L)+1L);
        }
        return cnt;
    }
}