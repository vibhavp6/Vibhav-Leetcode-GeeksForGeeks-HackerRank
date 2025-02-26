//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class GfG {
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data);
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int n = str.length;
            Node head = new Node(Integer.parseInt(str[0]));
            Node tail = head;
            for (int i = 1; i < n; i++) {
                tail.next = new Node(Integer.parseInt(str[i]));
                tail = tail.next;
            }
            Solution obj = new Solution();
            head = obj.addOne(head);
            printList(head);
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node revLL (Node head) {
            Node curr = head;
            Node prev = null;
            while (curr != null) {
                Node nextnode = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextnode;
            }
            return prev;
        }
    public Node addOne(Node head) {
        // code here.
        Node rvs = revLL(head);
        int carry = 1;
        Node curr = rvs;
        while (curr != null) {
            int sum = carry + (curr.data);
            curr.data = sum % 10;
            carry = sum / 10;
            curr = curr.next;
        }

        head = revLL(rvs);

        if (carry > 0) {
            Node newNode = new Node(carry);
            newNode.next = head;
            return newNode;
        }
        return head;
    }
}