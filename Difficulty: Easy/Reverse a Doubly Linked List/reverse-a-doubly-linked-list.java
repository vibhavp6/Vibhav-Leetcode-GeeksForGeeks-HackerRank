/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        // If the list is empty or has only one node, return head
        if (head == null || head.next == null) return head;

        Node current = head;
        Node temp = null;

        // Traverse the list and swap next and prev for each node
        while (current != null) {
            // Swap next and prev
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            // Move to the next node (which is prev due to the swap)
            current = current.prev;
        }

        // After the loop, temp will point to the previous node of null
        // which is the new head
        if (temp != null) {
            head = temp.prev;
        }

        return head;
    }
    
}