# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isEvenOddTree(self, root: Optional[TreeNode]) -> bool:
        queue = deque([root])
        level = 0
        while queue:
            size = len(queue)
            previous = -1
            for i in range(size):
                node = queue.popleft()
                if (level % 2 == 0 and (node.val % 2 == 0 or (previous!=-1 and node.val <= previous))) or (level % 2 == 1 and (node.val % 2 == 1 or (previous!=-1 and node.val >= previous))):
                    return False
                previous = node.val
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
            level+=1
        return True
