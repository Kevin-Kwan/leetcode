/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode() {}
 * ListNode(int val) { this.val = val; } ListNode(int val, ListNode next) { this.val = val;
 * this.next = next; } }
 */
class Solution {
  public ListNode removeNthFromEnd(ListNode head, int n) {
    int length = 0;
    ListNode tempHead = head;
    while (tempHead != null) {
      length++;
      tempHead = tempHead.next;
    }
    int targetindex = length - n;
    System.out.println(targetindex);
    System.out.println(length);
    int index = 0;
    tempHead = head;
    if (targetindex == 0) {
      if (tempHead.next == null) {
        return null;
      }
      head = tempHead.next;
      return head;
    } else {
      while (index < targetindex - 1) {
        tempHead = tempHead.next;
        index++;
      }
      ListNode temp = tempHead.next.next;
      tempHead.next = temp;
      return head;
    }
  }
}
