class Solution:
    def onesMinusZeros(self, grid: List[List[int]]) -> List[List[int]]:
        m, n = len(grid), len(grid[0])
        onesRow = [row.count(1) for row in grid]
        onesCol = [col.count(1) for col in zip(*grid)]
        zerosRow = [row.count(0) for row in grid]
        zerosCol = [col.count(0) for col in zip(*grid)]
        diff = [[onesRow[i] + onesCol[j] - zerosRow[i] - zerosCol[j] for j in range(n)] for i in range(m)]
        return diff
