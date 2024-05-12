class Solution:
    def largestLocal(self, grid: List[List[int]]) -> List[List[int]]:
        ans = []
        n = len(grid[0])-1
        for i in range(1,n):
            row = []
            for j in range(1,n):
                row.append(self.calcMax3x3(i-1, j-1, grid))
            ans.append(row)
        return ans

    def calcMax3x3(self,rowStart,colStart, grid):
        temp = 0
        for i in range(rowStart,rowStart+3):
            for j in range(colStart, colStart+3):
                temp = max(temp,grid[i][j])
        return temp
