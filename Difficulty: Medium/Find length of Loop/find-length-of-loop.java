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

    public int lengthOfLoop(Node head) {

        // code here

        if(head==null) return 0;

        Node curr=head;

        while(curr!=null){

            if(curr.data==-1) break;

            curr.data=-1;

            curr=curr.next;

        }

        if(curr==null) return 0;

        int len=0;

        while(curr.data!=-2){

            len++;

            curr.data=-2;

            curr=curr.next;

        }

        return len;

    }

}