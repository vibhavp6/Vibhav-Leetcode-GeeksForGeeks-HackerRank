//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public static Node buildTree(String str) {
        // Corner Case
        if (str.length() == 0 || str.charAt(0) == 'N') return null;

        // Creating array of Strings from input
        // String after spliting by space
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

    public static Node inputTree(BufferedReader br) throws IOException {
        return buildTree(br.readLine().trim());
    }

    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            Node root = Node.inputTree(br);

            Solution obj = new Solution();
            int res = obj.pairsViolatingBST(n, root);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    int i = 0, count = 0;
    public int pairsViolatingBST(int n, Node root) {
        i = 0; count = 0;
        int[] arr = new int[n];
        inOrder(root, arr);
        mergeSort(arr, 0, n-1);
        return count;
    }
    public void inOrder(Node root, int[] arr)
    {
        if(root == null)
        return;
        
        inOrder(root.left, arr);
        arr[i++] = root.data;
        inOrder(root.right, arr);
    }
    public void mergeSort(int[] arr, int low, int high)
    {
        if(low >= high)
        return;
        
        int mid = (low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }
    public void merge(int[] arr, int low, int mid, int high)
    {
        int[] temp = new int[high-low+1];
        i = low;
        int j = mid+1, k = 0;
        
        while(i <= mid && j <= high)
        {
            if(arr[i] <= arr[j])
            temp[k++] = arr[i++];
            else
            {
                count+=(mid-i+1);
                temp[k++] = arr[j++];
            }
        }
        
        while(i <= mid)
        temp[k++] = arr[i++];
        
        while(j <= high)
        temp[k++] = arr[j++];
        
        k = 0;
        for(i=low; i<=high; i++, k++)
        arr[i] = temp[k];
    }
}
