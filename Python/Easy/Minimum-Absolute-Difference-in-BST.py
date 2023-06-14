# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    sortedList = []
    def getMinimumDifference(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        self.sortedList = []
        self.inorder(root)
        min = self.sortedList[1]-self.sortedList[0]
        for i in range(2,len(self.sortedList)):
            if (self.sortedList[i]-self.sortedList[i-1]<min):
                min = self.sortedList[i]-self.sortedList[i-1]
        return min
        
    def inorder(self, node):
        if (node is None):
            return
        self.inorder(node.left)
        self.sortedList.append(node.val)
        self.inorder(node.right)
