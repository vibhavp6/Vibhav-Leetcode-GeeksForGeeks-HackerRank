//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M));
            t--;
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to find if there is a celebrity in the party or not.
    public int celebrity(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            //Number of people known by each person(row)
            int numPeopleKnown = 0; 
            
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    numPeopleKnown += 1;
                }
            }
            
            //Celebrity knows no one (numPeopleKnown == 0)
            if (numPeopleKnown == 0){
                for (int j = 0; j < mat.length; j++){
                    //Excluding celebrity row
                    if (j != i) {
                        //If someone doesn't know celebrity
                        if (mat[j][i] == 0) {
                            return -1;
                        }
                    }
                }
                return i;
            }
        }
        
        return -1;
    }
}