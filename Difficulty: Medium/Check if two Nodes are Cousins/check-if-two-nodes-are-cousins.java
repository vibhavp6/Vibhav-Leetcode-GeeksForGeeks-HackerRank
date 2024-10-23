//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class GfG {

    static Node buildTree(String str) {

        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }

        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        // Starting from the second element

        int i = 1;
        while (queue.size() > 0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length) break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    static void printInorder(Node root) {
        if (root == null) return;

        printInorder(root.left);
        System.out.print(root.data + " ");

        printInorder(root.right);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        // Scanner sc = new Scanner(System.in);
        while (t > 0) {
            String s = br.readLine();
            Node root = buildTree(s);
            Solution g = new Solution();
            String X = br.readLine();
            String arr[] = X.split(" ");
            int x, y;
            x = Integer.parseInt(arr[0]);
            y = Integer.parseInt(arr[1]);
            if (g.isCousins(root, x, y))
                System.out.println(1);
            else
                System.out.println(0);
            t--;
        }
    }
}

// } Driver Code Ends


/*
Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/
// User function Template for Java

class Solution {
    public boolean isCousins(Node root, int a, int b) {
        if (root == null || root.data == a || root.data == b) return false;

        // Use a queue for level order traversal (BFS)
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        // Start traversing level by level
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean isOneNodeFound = false; // This tracks if one node (a or b) is found at this level

            for (int i = 0; i < size; i++) {
                Node curr = queue.poll();

                // Check if the current node has both left and right children
                // If the two nodes (a and b) are direct siblings, they cannot be cousins
                if (curr.left != null && curr.right != null) {
                    if ((curr.left.data == a && curr.right.data == b) || 
                        (curr.left.data == b && curr.right.data == a)) {
                        return false;
                    }
                }

                // Check if either 'a' or 'b' exists at this level
                if (curr.left != null) {
                    if (curr.left.data == a || curr.left.data == b) {
                        if (isOneNodeFound == true) return true; // Found both 'a' and 'b' on the same level
                        isOneNodeFound = true; // Found one node (either 'a' or 'b')
                    }
                    queue.add(curr.left);
                }

                if (curr.right != null) {
                    if (curr.right.data == a || curr.right.data == b) {
                        if (isOneNodeFound == true) return true; // Found both 'a' and 'b' on the same level
                        isOneNodeFound = true; // Found one node (either 'a' or 'b')
                    }
                    queue.add(curr.right);
                }
            }

            // If we found only one of the nodes at this level, they can't be cousins
        }

        return false; // If we exit the loop, 'a' and 'b' are not cousins
    }
}
