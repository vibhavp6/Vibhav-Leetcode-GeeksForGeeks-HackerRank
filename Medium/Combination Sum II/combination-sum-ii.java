//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter ot = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String s[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int a[] = new int[n];
            s = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);
            List<List<Integer>> ans = new Solution().CombinationSum2(a, n, k);
            for (List<Integer> list : ans) {
                for (int x : list) ot.print(x + " ");
                ot.println();
            }
            if (ans.size() == 0) ot.println();
        }
        ot.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public List<List<Integer>> CombinationSum2(int arr[], int n, int k) {
        // Code Here.
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> mainList = new ArrayList<>();
        Arrays.sort(arr);
        HashSet<List<Integer>> hs = new HashSet<>();
        Combination(arr,0,0, k,n,list,mainList,hs);
        
        //Collections.sort(mainList);
        
        return mainList;
    }
    
    public void Combination(int[] arr, int i, int sum, int k, int n, List<Integer> list, List<List<Integer>> mainList,HashSet<List<Integer>> hs)
    {
        //System.out.println(sum + " " + k);
        if(sum == k)
        {
            if(!hs.contains(list))
            {
               mainList.add(new ArrayList<>(list));
               hs.add(list);
            }
            return;
        }
        
        if(i == n)
        {
            return;
        }
        
        if(sum + arr[i] <= k)
        {
            list.add(arr[i]);
            Combination(arr,i+1,sum+arr[i],k,n,list,mainList,hs);
            list.remove(list.size()-1);
            Combination(arr,i+1,sum,k,n,list,mainList,hs);
        }
        else
        {
            Combination(arr,i+1,sum,k,n,list,mainList,hs);
        }
    }
}
