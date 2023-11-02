# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def __init__(self):
        self.count = 0

    def averageOfSubtree(self, root: Optional[TreeNode]) -> int:
        self.helper(root)
        return self.count

    def helper(self, root):
        if root:
            self.helper(root.left)
            self.helper(root.right)
            root.sum = root.val
            root.numNodes = 1
            if root.left:
                root.sum += root.left.sum
                root.numNodes += root.left.numNodes
            if root.right:
                root.sum += root.right.sum
                root.numNodes += root.right.numNodes
            if root.val == int(root.sum / root.numNodes):
                self.count += 1
