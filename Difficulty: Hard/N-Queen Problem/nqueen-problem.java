//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(in.readLine());

            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> ans = ob.nQueen(n);
            if (ans.size() == 0)
                System.out.println("-1");
            else {
                ans.sort((list1, list2) -> {
                    int size = Math.min(list1.size(), list2.size());
                    for (int i = 0; i < size; i++) {
                        if (!list1.get(i).equals(list2.get(i))) {
                            return list1.get(i) - list2.get(i);
                        }
                    }
                    return list1.size() - list2.size();
                });

                for (int i = 0; i < ans.size(); i++) {
                    System.out.print("[");
                    for (int j = 0; j < ans.get(i).size(); j++)
                        System.out.print(ans.get(i).get(j) + " ");
                    System.out.print("] ");
                }
                System.out.println();
            }

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    ArrayList<ArrayList<Integer>>list;
    int[][] board;
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        list=new ArrayList<>();
        board=new int[n][n];
        solveNQueen(0,n);
        return list;
        
    }
    private boolean isSafe(int row,int col,int N){
        for(int i=0;i<col;i++){
            if(board[row][i]==1){
                return false;
            }
        }
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i < N && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        return true;
    }
    private void solveNQueen(int col,int N){
        if(col>=N){
            printSolution(N);
            return;
        }
        for(int i=0;i<N;i++){
            if(isSafe(i,col,N)){
                board[i][col]=1;
                solveNQueen(col+1,N);
                board[i][col]=0;
            }
        }
    }
    private void printSolution(int N) {
        ArrayList<Integer>ll=new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(board[i][j]==1){
                    ll.add(j+1);
                }
                // System.out.print((board[i][j] == 1 ? "Q " : "- "));
            }
        }
        list.add(ll);
    }
}