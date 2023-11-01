# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def findMode(self, root: Optional[TreeNode]) -> List[int]:
        # hashmap
        # bfs
        queue = [root]
        visited = set()
        hashmap = {}
        answer = []
        max_amount = 0
        while queue:
            node = queue.pop(0)
            if node not in visited:
                visited.add(node)
                hashmap[node.val] = hashmap.get(node.val,0)+1
                if node.left is not None:
                    queue.append(node.left)
                if node.right is not None:
                    queue.append(node.right)
        # print(hashmap)
        for key, value in hashmap.items():
            if value > max_amount:
                answer = []
                answer.append(key)
                max_amount = value
            elif value == max_amount:
                answer.append(key)
        return answer
        
