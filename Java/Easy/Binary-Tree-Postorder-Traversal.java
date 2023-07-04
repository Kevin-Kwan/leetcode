/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> answer = new LinkedList<>();
        postorderHelper(root, answer);
        return answer;
    }
    public void postorderHelper(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        postorderHelper(node.left,list);
        postorderHelper(node.right,list);
        list.add(node.val);
    }
}
