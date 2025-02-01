//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt(); // Number of test cases
        while (tc-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            char[][] mat = new char[n][m];

            // Reading the matrix
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    mat[i][j] = sc.next().charAt(0);
                }
            }

            String word = sc.next();
            Solution obj = new Solution();
            boolean ans = obj.isWordExist(mat, word);
            if (ans)
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
        sc.close();
    }
}
// } Driver Code Ends


class Solution {
    static public boolean isWordExist(char[][] mat, String word) {
        // Code here
        int m=mat.length;
        int n=mat[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==word.charAt(0)){
                    if(dfs(mat,word,0,i,j)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    static boolean dfs(char[][] mat,String word, int idx,int i,int j){
        if(idx>=word.length()){
            return true;
        }
        if(i<0||j<0||i>=mat.length||j>=mat[0].length||
        mat[i][j]!=word.charAt(idx)){
            return false;
        }
        char temp=mat[i][j];
        mat[i][j]='#';
        boolean res=dfs(mat,word,idx+1,i+1,j)||
                    dfs(mat,word,idx+1,i-1,j)||
                    dfs(mat,word,idx+1,i,j+1)||
                    dfs(mat,word,idx+1,i,j-1);
        mat[i][j]=temp;
      return res;
                    
        
    }
}

