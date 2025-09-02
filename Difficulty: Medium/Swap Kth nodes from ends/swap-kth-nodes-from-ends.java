/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node swapKth(Node head, int k) {
        // code here
        Node temp=head;
        int len=0;
        Node first=null;
        while(temp!=null)
        {
            len++;
            if(len==k)first=temp;
            temp=temp.next;
        }
        if(first==null)return head;
        temp=head;
        int it=len-k;
        while(it>0)
        {
            temp=temp.next;
            it--;
        }
        Node last=temp;
        int curr=first.data;
        first.data=last.data;
        last.data=curr;
        return head;
        
    }
}