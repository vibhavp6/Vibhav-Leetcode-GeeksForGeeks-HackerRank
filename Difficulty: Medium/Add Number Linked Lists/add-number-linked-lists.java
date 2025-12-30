/*
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
    public Node rev(Node head){
        Node prev = null;
        Node curr = head;
        while(curr != null){
            Node forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        return prev;
    }
    public Node addTwoLists(Node head1, Node head2) {
        head1 = rev(head1);
        head2 = rev(head2);
        Node dummy = new Node(-1);
        Node temp = dummy;
        int rem = 0;
        while(head1 != null || head2 != null || rem != 0){
            int val1 = head1 != null ? head1.data : 0;
            int val2 = head2 != null ? head2.data : 0;
            int sum =  val1 + val2 + rem;
            temp.next = new Node(sum % 10);
            rem = sum / 10;
            if(head1 != null) head1 = head1.next;
            if(head2 != null) head2 = head2.next;
            temp = temp.next;
        }
       Node answer = rev(dummy.next);
        while(answer != null && answer.data == 0 && answer.next != null){
            answer = answer.next;
        }
       
       return answer;
    }
}