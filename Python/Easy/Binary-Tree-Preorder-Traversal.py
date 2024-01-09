# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def leafSimilar(self, root1: Optional[TreeNode], root2: Optional[TreeNode]) -> bool:
        return self.preorderTraversal(root1) == self.preorderTraversal(root2) 
    def preorderTraversal(self, root):
        sequence = []
        self.preorderHelper(root, sequence)
        return sequence
    def preorderHelper(self, node, sequence):
        if not node:
            return
        if not node.left and not node.right:
            sequence.append(node.val)
        self.preorderHelper(node.left, sequence)
        self.preorderHelper(node.right, sequence)
        
