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
    public ListNode mergeNodes(ListNode head) {
        ListNode newHead = new ListNode();
        ListNode answer = newHead;
        while (head.next!=null) {
            if (head.val == 0) {
                answer.next = new ListNode();
                answer = answer.next;
            } else {
                answer.val+=head.val;
            }
            head = head.next;
         }
         return newHead.next;
    }
}
