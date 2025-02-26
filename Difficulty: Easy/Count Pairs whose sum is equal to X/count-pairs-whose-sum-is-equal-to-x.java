//{ Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}


// } Driver Code Ends

// your task is to complete this function

/*class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    // Function to count pairs in two linked lists whose sum is equal to x
    public int countPairs(Node head1, Node head2, int x) {
        // add your code here
        HashSet <Integer> ans = new HashSet<>();
        int count =0;
        Node temp = head1;
        while (temp!= null) {
            ans.add(temp.data);
            temp= temp.next;
        }
        temp = head2;
        while  (temp != null) {
            int cont = x - temp.data;
            if (ans.contains(cont)) count++;
            temp =temp.next;
        }
        return count;
    }
}



//{ Driver Code Starts.

public class Main {
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); // Consume the newline character after the integer input

        while (T-- > 0) {
            Node head1 = null, tail1 = null;
            Node head2 = null, tail2 = null;

            // Reading input for the first linked list
            String input1 = sc.nextLine().trim();
            if (!input1.isEmpty()) {
                String[] elems1 = input1.split(" ");
                for (String elem : elems1) {
                    Node newNode = new Node(Integer.parseInt(elem));
                    if (head1 == null) {
                        head1 = newNode;
                        tail1 = newNode;
                    } else {
                        tail1.next = newNode;
                        tail1 = newNode;
                    }
                }
            }

            // Reading input for the second linked list
            String input2 = sc.nextLine().trim();
            if (!input2.isEmpty()) {
                String[] elems2 = input2.split(" ");
                for (String elem : elems2) {
                    Node newNode = new Node(Integer.parseInt(elem));
                    if (head2 == null) {
                        head2 = newNode;
                        tail2 = newNode;
                    } else {
                        tail2.next = newNode;
                        tail2 = newNode;
                    }
                }
            }

            int x = sc.nextInt();
            if (sc.hasNextLine()) sc.nextLine(); // Consume leftover newline
            Solution obj = new Solution();
            int count = obj.countPairs(head1, head2, x);
            System.out.println(count);
            System.out.println("~");
        }
        sc.close();
    }
}
// } Driver Code Ends