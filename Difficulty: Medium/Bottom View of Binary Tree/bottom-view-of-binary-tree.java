//{ Driver Code Starts
//Initial Template for Java


//Contributed by Sudarshan Sharma
import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node
{
    int data; //data of the node
    int hd; //horizontal distance of the node
    Node left, right; //left and right references
 
    // Constructor of tree node
    public Node(int key)
    {
        data = key;
        hd = Integer.MAX_VALUE;
        left = right = null;
    }
}



class GfG {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
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
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    static void printInorder(Node root)
    {
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t-- > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
    	        Solution ob = new Solution();
			    ArrayList <Integer> res = ob.bottomView(root);
			    for (Integer num : res) System.out.print (num + " ");
		     	System.out.println();
	        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to return a list containing the bottom view of the given tree.
     public ArrayList<Integer> bottomView(Node root) {
        // Result list to store the bottom view
        ArrayList<Integer> result = new ArrayList<>();
        
        // TreeMap to store the bottom view nodes with horizontal distance as key
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        // Queue for level order traversal
        Queue<Pair> queue = new LinkedList<>();
        
        // Start with the root node at horizontal distance 0
        if (root != null) {
            queue.add(new Pair(root, 0));
        }
        
        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            Node node = current.node;
            int hd = current.hd; // Horizontal distance
            
            // Update the map with the current node's value
            map.put(hd, node.data);
            
            // Add the left child to the queue with horizontal distance -1
            if (node.left != null) {
                queue.add(new Pair(node.left, hd - 1));
            }
            
            // Add the right child to the queue with horizontal distance +1
            if (node.right != null) {
                queue.add(new Pair(node.right, hd + 1));
            }
        }
        
        // Extract the values from the map in order of horizontal distance
        for (Integer value : map.values()) {
            result.add(value);
        }
        
        return result; // Return the bottom view
    }
}

// Helper class for storing node and its horizontal distance
class Pair {
    Node node;
    int hd; // horizontal distance
    
    Pair(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}