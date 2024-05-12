class Solution:
    def satisfiesConditions(self, grid: List[List[int]]) -> bool:
        n = len(grid) # rows
        m = len(grid[0]) # cols 
        for r in range(n):
            for c in range(m):
                if (r+1)<n:
                    if grid[r][c] != grid[r + 1][c]:
                        return False
                if (c+1)<m:
                    if grid[r][c] == grid[r][c + 1]:
                        return False
        return True
