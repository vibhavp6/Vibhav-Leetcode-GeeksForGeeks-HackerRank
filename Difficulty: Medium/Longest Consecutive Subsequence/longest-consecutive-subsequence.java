//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            // Read first array
            String input = br.readLine();
            String[] inputArray = input.split(" ");
            int[] arr = Arrays.stream(inputArray).mapToInt(Integer::parseInt).toArray();

            Solution ob = new Solution();
            int res = ob.longestConsecutive(arr);

            System.out.println(res);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        int n=arr.length;
        HashSet<Integer>set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        
         int longest=1;
         for(int it:set){
             if(!set.contains(it-1)){
                 int x=it;
                 int count=1;
                 while(set.contains(x+1)){
                     count++;
                     x=x+1;
                 }
                 longest=Math.max(count,longest);
             }
         }
         
        return longest;
    }
}

