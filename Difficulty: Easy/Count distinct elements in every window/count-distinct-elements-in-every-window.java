//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.HashMap;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            ArrayList<Integer> array = new ArrayList<>();

            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int k = Integer.parseInt(br.readLine());

            ArrayList<Integer> ans = new Solution().countDistinct(arr, k);

            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();

            t--;
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution 
{
    public static int helper(int x[],int i,int n)
    {
        Set<Integer> s = new HashSet<>();
        for(i=i;i<n;i++)
        {
            if(!s.contains(x[i]))
            {
                s.add(x[i]);
            }
        }
        return s.size();
    }
    ArrayList<Integer> countDistinct(int arr[], int k) 
    {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<=arr.length-k;i++)
        {
           al.add(helper(arr,i,k+i));
        }
        
        return al;
    }
}

