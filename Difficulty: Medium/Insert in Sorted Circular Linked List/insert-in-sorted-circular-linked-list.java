/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node sortedInsert(Node head, int data) {
        // code here
        Node ptr = head;
        Node p = new Node(data);
        if(head == null){
            p.next = p;
            return p;
        }
        if (data < head.data) {
            // Find last node
            while (ptr.next != head) {
                ptr = ptr.next;
            }
            ptr.next = p;
            p.next = head;
            return p; // new head
        }
        
        while(ptr.next !=head && ptr.next.data<data){
                ptr = ptr.next;
        }
        
        
        p.next = ptr.next;
        ptr.next = p;
      
        return head;
    }
}

