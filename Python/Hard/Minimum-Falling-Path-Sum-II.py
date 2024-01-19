class Solution:
    def minFallingPathSum(self, grid: List[List[int]]) -> int:
        n = len(grid)
        for row in range(1,n):
            for col in range(n):
                grid[row][col] += min(grid[row-1][:col]+grid[row-1][col+1:])
        return min(grid[-1])
