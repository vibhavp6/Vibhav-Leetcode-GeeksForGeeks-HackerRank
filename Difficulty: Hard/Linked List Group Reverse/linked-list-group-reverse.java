/*
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {
    public static Node reverseKGroup(Node head, int k) {
        // code here
        if(head==null) return head;
        
        Node Prev=null, Next=null, finalHead=null,PrevNode=null;
        Node curr=head; boolean flag=true;
        while (curr!=null)
        {
        int count=0;
        Node last=curr; Prev=null;
         while(curr !=null && count<k)
         {
             Next=curr.next;
             curr.next=Prev;
             Prev=curr;
             curr=Next;
             count++;
         }
        
          if(flag)
          {finalHead=Prev; flag=false;}
          else{PrevNode.next=Prev;}
          
          PrevNode=last;
        }
      
        return finalHead;
    }
}