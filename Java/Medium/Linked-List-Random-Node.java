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

    List<Integer> data;
    Random rand = new Random();

    public Solution(ListNode head) {
        data = new ArrayList<>();
        while (head!=null) {
            data.add(head.val);
            head = head.next;
        }
    }
    
    public int getRandom() {
        int randomInt = rand.nextInt(data.size());
        return data.get(randomInt);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
