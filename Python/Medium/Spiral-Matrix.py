class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        cols = len(matrix[0])
        rows = len(matrix)
        ans = []
        direction = 1
        col, row = -1, 0
        while cols > 0 and rows > 0:
            for _ in range(cols):
                col+=direction
                ans.append(matrix[row][col])
            rows-=1
            for _ in range(rows):
                row+=direction
                ans.append(matrix[row][col])
            cols-=1
            direction*=-1
        return ans
            
