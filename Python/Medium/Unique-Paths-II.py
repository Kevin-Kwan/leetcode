class Solution:
    def uniquePathsWithObstacles(self, obstacleGrid: List[List[int]]) -> int:
        n = len(obstacleGrid[0])
        m = len(obstacleGrid)
        table = [[0 for _ in range(n)] for _ in range(m)]
        for r in range(m):
            for c in range(n):
                if (r==0 and c== 0 and obstacleGrid[r][c]!=1):
                    table[r][c] = 1
                elif (obstacleGrid[r][c]==1):
                    table[r][c]=0
                elif (r == 0 and c>0):
                    table[r][c] = table[r][c-1]
                elif (c == 0 and r>0):
                    table[r][c] = table[r-1][c]
                else: 
                    table[r][c]=table[r-1][c]+table[r][c-1]
        return table[m-1][n-1]
