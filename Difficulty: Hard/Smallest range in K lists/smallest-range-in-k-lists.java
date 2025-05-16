//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

public class DriverClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[][] = new int[k][n];
            for (int i = 0; i < k; i++) {
                for (int j = 0; j < n; j++) arr[i][j] = sc.nextInt();
            }
            ArrayList<Integer> range = new Solution().findSmallestRange(arr);
            System.out.println(range.get(0) + " " + range.get(1));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
     public ArrayList<Integer> findSmallestRange(int[][] arr) {
        // code here
        int A[][]=new int[arr.length*arr[0].length][];
        int k=0;
        for(int i=0;i<arr.length;i++){
            for(var a: arr[i]){
                A[k++]= new int[]{i,a};
            }
        }
        
        Arrays.sort(A,(o1,o2)->Integer.compare(o1[1],o2[1]));
        
        int i=0;
        int len=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        int ans[]= new int[]{A[0][1],A[k-1][1]};
        for(int j=0;j<A.length;j++){
            map.put(A[j][0],map.getOrDefault(A[j][0],0)+1);
            
            while(map.size()==len){
                 if(ans[1]-ans[0] > A[j][1]-A[i][1]){
                    ans[0]=A[i][1];
                    ans[1]=A[j][1];
                }
                
                if(map.get(A[i][0])==1){
                    map.remove(A[i][0]);
                }
                else{
                    map.put(A[i][0],map.get(A[i][0])-1);
                }
                i++;
            }
        }
        
        ArrayList<Integer> t=new ArrayList<>();
        t.add(ans[0]);t.add(ans[1]);
        return t;
    }
}