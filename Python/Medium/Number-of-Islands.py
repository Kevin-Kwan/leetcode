class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        self.m = len(grid)
        self.n = len(grid[0])
        answer = 0
        for r in range(self.m):
            for c in range(self.n):
                if grid[r][c]=='1':
                    self.dfs(r,c,grid)
                    answer+=1
        return answer
    def dfs(self, r, c, grid):
        if r<0 or c<0 or r>=self.m or c>=self.n or grid[r][c]=='0':
            return
        grid[r][c] = '0'
        self.dfs(r+1,c,grid)
        self.dfs(r-1,c,grid)
        self.dfs(r,c+1,grid)
        self.dfs(r,c-1,grid)
