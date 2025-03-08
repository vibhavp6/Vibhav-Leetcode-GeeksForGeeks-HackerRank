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
    public ListNode reverse (ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr!= null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    public ListNode kthNode (ListNode head , int k) {
        ListNode temp = head;
        for(int i= 1; i<k ; i++) {
            if(temp.next == null) return null;
            temp = temp.next;
        }
        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        ListNode prev = null;
        while(curr!= null) {
            ListNode temp = kthNode(curr , k);
            if(temp == null) break;
            ListNode nextnode = temp.next;
            temp.next = null;
            reverse(curr);
            if(head == curr) {
                head = temp;
                curr.next = nextnode;
            }else{
                prev.next = temp;
                curr.next = nextnode;
            }
            prev = curr;
            curr = nextnode;
        }
        return head;
    }
}