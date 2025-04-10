//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}

class GFG {
    static Node buildTree(String str) {
        // Corner Case
        if (str.length() == 0 || str.equals('N')) return null;
        String[] s = str.split(" ");

        Node root = new Node(Integer.parseInt(s[0]));
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        // Starting from the second element
        int i = 1;
        while (!q.isEmpty() && i < s.length) {
            // Get and remove the front of the queue
            Node currNode = q.remove();

            // Get the current node's value from the string
            String currVal = s[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                q.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= s.length) break;
            currVal = s[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                q.add(currNode.right);
            }

            i++;
        }

        return root;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t > 0) {
            String s = br.readLine();
            Node root = buildTree(s);

            Solution T = new Solution();

            ArrayList<Integer> res = T.boundaryTraversal(root);
            for (Integer num : res) System.out.print(num + " ");
            System.out.println();
            t--;

            System.out.println("~");
        }
    }
}

// } Driver Code Ends




//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }


class Solution {

    public static boolean isLeaf(Node root) {
        return (root.left == null && root.right == null);
    }

    public static void addLeftNode(Node node, ArrayList<Integer> al) {
        Node temp = node;
        while (temp != null) {
            if (!isLeaf(temp))
                al.add(temp.data);
            if (temp.left != null)
                temp = temp.left;
            else
                temp = temp.right;
        }
    }

    public static void addRootNode(Node root, ArrayList<Integer> al) {
        if (isLeaf(root)) {
            al.add(root.data);
            return;
        }
        if (root.left != null)
            addRootNode(root.left, al);
        if (root.right != null)
            addRootNode(root.right, al);
    }

    public static void addRightNode(Node node, ArrayList<Integer> al) {
        Node temp = node;
        ArrayList<Integer> res = new ArrayList<>();
        while (temp != null) {
            if (!isLeaf(temp))
                res.add(temp.data);
            if (temp.right != null)
                temp = temp.right;
            else
                temp = temp.left;
        }
        for (int i = res.size() - 1; i >= 0; i--)
            al.add(res.get(i));
    }

    // ✅ Renamed this method as per standard GFG requirement
    ArrayList<Integer> boundaryTraversal(Node node) {
        ArrayList<Integer> al = new ArrayList<>();
        if (!isLeaf(node))
            al.add(node.data);
        if (node.left != null)
            addLeftNode(node.left, al);
        addRootNode(node, al);
        if (node.right != null)
            addRightNode(node.right, al);
        return al;
    }
}
