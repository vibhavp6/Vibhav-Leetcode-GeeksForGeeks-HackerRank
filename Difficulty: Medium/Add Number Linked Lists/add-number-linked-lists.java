//{ Driver Code Starts
// driver

import java.io.*;
import java.util.*;


// } Driver Code Ends
/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution {
    static Node addTwoLists(Node num1, Node num2) {
        // code here
         Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        while(num1 != null){
            s1.push(num1.data);
            num1 = num1.next;
        }
         while(num2 != null){
            s2.push(num2.data);
            num2 = num2.next;
        }
        Node result = null;
        int carry = 0;
        while(!s1.isEmpty() || !s2.isEmpty() || carry != 0){
            int val1 = s1.isEmpty() ? 0: s1.pop();
            int val2 = s2.isEmpty()? 0: s2.pop();
            int sum = val1 + val2 + carry;
           
            Node newNode = new Node(sum % 10);
            newNode.next = result;
            result = newNode;
            carry = sum / 10;
            
        }
        while (result != null && result.data == 0) {
        result = result.next;
    }

    // If the result is empty (in case of 0), return a single node with 0
    return result != null ? result : new Node(0);
    }
}

//{ Driver Code Starts.

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG {

    static void printList(Node n) {
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(read.readLine());
        while (T-- > 0) {

            String str[] = read.readLine().trim().split(" ");
            int n = str.length;

            Node num1 = new Node(Integer.parseInt(str[0]));
            Node tail = num1;
            for (int i = 1; i < n; i++) {
                int val = Integer.parseInt(str[i]);
                tail.next = new Node(val);
                tail = tail.next;
            }

            String str2[] = read.readLine().trim().split(" ");
            int m = str2.length;

            Node num2 = new Node(Integer.parseInt(str2[0]));
            tail = num2;
            for (int i = 1; i < m; i++) {

                tail.next = new Node(Integer.parseInt(str2[i]));
                tail = tail.next;
            }

            Solution g = new Solution();
            Node res = g.addTwoLists(num1, num2);
            printList(res);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends