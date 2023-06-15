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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int maxSum = Integer.MIN_VALUE;
        int maxLevel = 0;
        int height = 0;
        while (!queue.isEmpty()) {
            int sizeOfLevel = queue.size();
            int sumOfLevel = 0;
            for (int i = 0; i<sizeOfLevel; i++) {
                TreeNode curr = queue.poll();
                sumOfLevel+=curr.val;
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
            height++;
            if (sumOfLevel > maxSum) {
                maxLevel = height;
                maxSum = sumOfLevel;
            }
        }
        return maxLevel;
    }
}
