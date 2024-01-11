# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxAncestorDiff(self, root: Optional[TreeNode]) -> int:
        return self.dfsHelper(root, root.val, root.val)
    def dfsHelper(self, node, minimum, maximum):
        if not node:
            return maximum - minimum
        maximum = max(maximum, node.val)
        minimum = min(minimum, node.val)
        left_diff = self.dfsHelper(node.left, minimum, maximum)
        right_diff = self.dfsHelper(node.right, minimum, maximum)
        return max(left_diff, right_diff)
