//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;

// a node of the doubly linked list
class Node {
    int data;
    Node next, prev;
}

class GFG {

    /* Function to insert a node at the beginning
        of the Doubly Linked List */
    static Node push(Node head, int new_data) {
        // allocate node
        Node new_node = new Node();

        // put in the data
        new_node.data = new_data;

        /* since we are adding at the beginning,
        prev is always NULL */
        new_node.prev = null;

        // link the old list off the new node
        new_node.next = head;

        // change prev of head node to new node
        if (head != null) head.prev = new_node;

        // move the head to point to the new node
        head = new_node;

        return head;
    }

    /* Function to print nodes in a given doubly
        linked list */
    static void printList(Node temp) {
        if (temp == null) System.out.print(-1);

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // Driver code
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Node head = null;
            int n = sc.nextInt();
            int inp[] = new int[n];
            for (int i = 0; i < n; i++) inp[i] = sc.nextInt();
            for (int i = n - 1; i >= 0; i--) {
                head = push(head, inp[i]);
            }
            int x = sc.nextInt();
            Solution obj = new Solution();
            head = obj.deleteAllOccurOfX(head, x);
            printList(head);
            System.out.println();
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

/* Structure of Doubly Linked List
class Node
{
	int data;
	Node next;
	Node prev;
	Node(int data)
	{
	    this.data = data;
	    next = prev = null;
	}
}*/
class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        Node curr = head;

        while (curr != null) {
            if (curr.data == x) {
                if (curr == head) {
                    head = head.next;  
                    if (head != null) {
                        head.prev = null; 
                    }
                } 
                else {
                    curr.prev.next = curr.next;
                    if (curr.next != null) {
                        curr.next.prev = curr.prev;
                    }
                }
            }
            curr = curr.next;
        }
        return head;
   }
}