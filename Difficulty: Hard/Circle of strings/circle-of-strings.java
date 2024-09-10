//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0) {
            String A[] = in.readLine().trim().split(" ");
            int N = Integer.parseInt(A[0]);
            A = in.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.isCircle(A));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int isCircle(String arr[]) {
        int n = arr.length;
        if (n == 0) return 0;
        
        // Create graph to store the in-degree and out-degree of each character.
        int[] inDegree = new int[26];
        int[] outDegree = new int[26];
        
        // Adjacency list to store the edges between characters.
        ArrayList<Integer>[] adj = new ArrayList[26];
        for (int i = 0; i < 26; i++) {
            adj[i] = new ArrayList<>();
        }
        
        // Fill in the degrees and adjacency list.
        for (String str : arr) {
            int first = str.charAt(0) - 'a';
            int last = str.charAt(str.length() - 1) - 'a';
            
            // Increment the out-degree of the first character and in-degree of the last character
            outDegree[first]++;
            inDegree[last]++;
            
            // Add edge from first character to last character
            adj[first].add(last);
        }
        
        // 1. Check if in-degree and out-degree of every character are the same
        for (int i = 0; i < 26; i++) {
            if (inDegree[i] != outDegree[i]) {
                return 0;
            }
        }
        
        // 2. Check if the graph is strongly connected
        // Find the first character that has a degree > 0
        int start = -1;
        for (int i = 0; i < 26; i++) {
            if (outDegree[i] > 0) {
                start = i;
                break;
            }
        }
        
        // Perform DFS to check if all nodes with a degree > 0 are reachable
        boolean[] visited = new boolean[26];
        dfs(start, adj, visited);
        
        // Check if all characters with a non-zero degree are visited
        for (int i = 0; i < 26; i++) {
            if (outDegree[i] > 0 && !visited[i]) {
                return 0;
            }
        }
        
        return 1;  // Circle can be formed
    }
    
    // DFS helper function to explore the graph
    private void dfs(int node, ArrayList<Integer>[] adj, boolean[] visited) {
        visited[node] = true;
        for (int neighbor : adj[node]) {
            if (!visited[neighbor]) {
                dfs(neighbor, adj, visited);
            }
        }
    }
}