class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        table = [[0 for _ in range(n)] for _ in range(m)]
        for r in range(m):
            for c in range(n):
                if (r == 0 or c == 0):
                    table[r][c] = 1
                else: 
                    table[r][c]=table[r-1][c]+table[r][c-1]
        return table[m-1][n-1]
