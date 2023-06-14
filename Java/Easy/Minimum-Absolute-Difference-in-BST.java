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
    TreeNode previousNode;
    int min = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        previousNode = null;
        inorderTraversal(root);
        return min;
    }
    
    // get the nodes in sorted order, then get the min difference
    void inorderTraversal(TreeNode root) {
        if (root==null) {
            return;
        }        
        inorderTraversal(root.left);
        if (previousNode!=null) {
            min = Math.min(min, Math.abs(previousNode.val- root.val));
        }
        previousNode = root;
        inorderTraversal(root.right);
    }
}
