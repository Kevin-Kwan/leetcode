class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        rows = set()
        cols = set()
        m = len(matrix)
        n = len(matrix[0])
        for r in range(m):
            for c in range(n):
                if matrix[r][c]==0:
                    rows.add(r)
                    cols.add(c)
        for r in range(m):
            for c in range(n):
                if r in rows or c in cols:
                    matrix[r][c]=0
        
