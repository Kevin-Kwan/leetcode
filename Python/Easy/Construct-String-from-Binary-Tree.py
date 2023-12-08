# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def tree2str(self, root: Optional[TreeNode]) -> str:
        self.answer = ""
        def preorderHelper(node):
            if node is None:
                return
            self.answer+=str(node.val)
            if node.left or node.right:
                self.answer+="("
                preorderHelper(node.left)
                self.answer+=")"
            if node.right:
                self.answer+="("
                preorderHelper(node.right)
                self.answer+=")"
        preorderHelper(root)
        return self.answer
