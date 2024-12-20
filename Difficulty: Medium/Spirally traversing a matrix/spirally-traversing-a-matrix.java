//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int r = sc.nextInt();
            int c = sc.nextInt();

            int matrix[][] = new int[r][c];

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        
        ArrayList<Integer> ans=new ArrayList<Integer>();
        
        int dgnl=0;
        int x=Math.min(n,m);
        while(dgnl<x){
            boolean anyUpdate=false;
            
            int i=dgnl;
            int j=dgnl;
            
            //->
            while(j<(m-dgnl)){
                ans.add(mat[i][j]);
                anyUpdate=true;
                if(j==(m-1-dgnl))
                    break;
                j++;
                
            }
           if(anyUpdate==false)
                break;
            anyUpdate=false;
            
            
            
            
            //down
            i++;
            while(i<(n-dgnl)){
                ans.add(mat[i][j]);
                anyUpdate=true;
                if(i==(n-1-dgnl))
                    break;
                i++;
                
            }
            if(anyUpdate==false)
                break;
            anyUpdate=false;
            
            
            
            
            
            //<-
            j--;
            while(j>=dgnl){
                ans.add(mat[i][j]);
                anyUpdate=true;
                if(j==dgnl)
                    break;
                j--;
                
            }
            if(anyUpdate==false)
                break;
            anyUpdate=false;
                        
            
            
            
            
            
            //up
            i--;
            while(i>dgnl){
                ans.add(mat[i][j]);
                anyUpdate=true;
                if(i==(dgnl+1))
                    break;
                i--;    
            }
            
            if(anyUpdate==false)
                break;
            dgnl++;   
        }
        
        return ans;
        
    }
}