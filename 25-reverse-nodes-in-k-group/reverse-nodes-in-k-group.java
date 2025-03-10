/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr!= null){
            ListNode nextnode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextnode;
        }
        return prev;
    }

    public ListNode getkh (ListNode head, int k){
        ListNode temp =  head;
        for(int i = 0; i<k-1; i++) {
            if(temp.next== null) return null;
            temp = temp.next;
        }
        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        ListNode prev = null;
        while(curr!= null) {
            ListNode temp = getkh(curr , k);
            if(temp == null) break;
            ListNode nextnode = temp.next;
            temp.next = null;
            reverse(curr); 
            if(head == curr){
                head = temp;
            }else{
                prev.next = temp;
            }
            curr.next = nextnode;
            prev = curr;
            curr = nextnode;
        }
        return head;
    }
}