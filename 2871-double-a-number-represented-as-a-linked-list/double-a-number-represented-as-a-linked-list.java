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
    public ListNode revLL(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;

        while (temp != null) {
            ListNode nextNode = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nextNode;
        }

        return prev;
    }

    public ListNode doubleIt(ListNode head) {
        ListNode rvs = revLL(head);
        ListNode curr = rvs;
        int carry = 0;

        while (curr != null) {
            int sum = carry + (curr.val * 2);
            curr.val = sum % 10;
            carry = sum / 10;
            curr = curr.next;
        }

        head = revLL(rvs);

        if (carry > 0) {
            ListNode newNode = new ListNode(carry);
            newNode.next = head;
            return newNode;
        }

        return head;
    }
}