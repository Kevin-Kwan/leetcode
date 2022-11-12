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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }
        ListNode dummyHead = new ListNode(0);
        ListNode currPtr = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                currPtr.next = list1;
                list1 = list1.next;
            } else {
                currPtr.next = list2;
                list2 = list2.next;
            }
            currPtr = currPtr.next;
        }
        while (list1 !=null || list2 !=null) {
            if (list1 != null) {
                if (currPtr == null) {
                    currPtr = list1;
                    list1 = list1.next;
                }
                currPtr.next = list1;
                list1 = list1.next;
            }
            if (list2 != null) {
                if (currPtr == null) {
                    currPtr = list2;
                    list2 = list2.next;
                }
                currPtr.next = list2;
                list2 = list2.next;
            }
            currPtr = currPtr.next;
        }
        return dummyHead.next;
    }
}
