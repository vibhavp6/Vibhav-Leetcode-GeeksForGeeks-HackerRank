//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.math.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.next());
        while (t-- > 0) {
            int n = Integer.parseInt(sc.next());
            int k = Integer.parseInt(sc.next());

            String[] words = new String[n];

            for (int i = 0; i < n; i++) {
                words[i] = sc.next();
            }

            Solution ob = new Solution();
            //  System.out.println(T.findOrder(words,k));
            String order = ob.findOrder(words, n, k);
            if (order.length() == 0) {
                System.out.println(0);
                continue;
            }
            if (order.length() != k) {
                System.out.println("INCOMPLETE");
                return;
            }
            String temp[] = new String[n];
            for (int i = 0; i < n; i++) temp[i] = words[i];

            Arrays.sort(temp, new Comparator<String>() {
                @Override
                public int compare(String a, String b) {
                    int index1 = 0;
                    int index2 = 0;
                    for (int i = 0;
                         i < Math.min(a.length(), b.length()) && index1 == index2;
                         i++) {
                        index1 = order.indexOf(a.charAt(i));
                        index2 = order.indexOf(b.charAt(i));
                    }

                    if (index1 == index2 && a.length() != b.length()) {
                        if (a.length() < b.length())
                            return -1;
                        else
                            return 1;
                    }

                    if (index1 < index2)
                        return -1;
                    else
                        return 1;
                }
            });

            int flag = 1;
            for (int i = 0; i < n; i++) {
                if (!words[i].equals(temp[i])) {
                    flag = 0;
                    break;
                }
            }

            System.out.println(flag);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public String findOrder(String [] dict, int N, int K) {
        // Step 1: Build the graph
        List<Set<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            adjList.add(new HashSet<>());
        }
        int[] inDegree = new int[K];
        
        // Compare adjacent words to build the graph
        for (int i = 0; i < N - 1; i++) {
            String word1 = dict[i];
            String word2 = dict[i + 1];
            int minLength = Math.min(word1.length(), word2.length());
            boolean foundDifference = false;
            for (int j = 0; j < minLength; j++) {
                if (word1.charAt(j) != word2.charAt(j)) {
                    int u = word1.charAt(j) - 'a';
                    int v = word2.charAt(j) - 'a';
                    if (!adjList.get(u).contains(v)) {
                        adjList.get(u).add(v);
                        inDegree[v]++;
                    }
                    foundDifference = true;
                    break;
                }
            }
            // If no difference was found and word1 is longer than word2, invalid order
            if (!foundDifference && word1.length() > word2.length()) {
                return "";  // Returning an empty string for invalid input
            }
        }
        
        // Step 2: Perform topological sort using Kahn's Algorithm (BFS)
        Queue<Integer> zeroInDegreeQueue = new LinkedList<>();
        for (int i = 0; i < K; i++) {
            if (inDegree[i] == 0) {
                zeroInDegreeQueue.add(i);
            }
        }
        
        StringBuilder order = new StringBuilder();
        while (!zeroInDegreeQueue.isEmpty()) {
            int u = zeroInDegreeQueue.poll();
            order.append((char)(u + 'a'));
            for (int v : adjList.get(u)) {
                inDegree[v]--;
                if (inDegree[v] == 0) {
                    zeroInDegreeQueue.add(v);
                }
            }
        }
        
        // If the order contains fewer characters than K, there's a cycle
        if (order.length() < K) {
            return "";  // Invalid input with a cycle
        }
        
        return order.toString();
    }
}