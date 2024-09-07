class Solution:
    def islandsAndTreasure(self, grid: List[List[int]]) -> None:
        self.queue = deque()
        self.visited = set()
        self.findTreasure(grid)
        directions = [[0, -1],[-1, 0],[1, 0],[0, 1]]

        while self.queue:
            row, col = self.queue.popleft()
            for dx, dy in directions:
                new_row, new_col = row + dx, col + dy
                if self.checkWithinBounds(grid, new_row, new_col) and grid[new_row][new_col] != -1:
                    grid[new_row][new_col] = grid[row][col] + 1
                    self.visited.add((new_row, new_col))
                    self.queue.append((new_row, new_col))
        

    def findTreasure(self, grid):
        m = len(grid)
        n = len(grid[0])
        for row in range(m):
            for col in range(n):
                if grid[row][col] == 0:
                    self.queue.append((row,col))
                    self.visited.add((row,col))
        return (-1, -1)
    
    def checkWithinBounds(self, grid, x, y):
        m = len(grid)
        n = len(grid[0])
        if x < 0 or y < 0 or x >= m or y >= n or (x, y) in self.visited:
            return False
        return True
