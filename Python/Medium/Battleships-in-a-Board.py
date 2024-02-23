class Solution:
    def countBattleships(self, board: List[List[str]]) -> int:
        self.m = len(board)
        self.n = len(board[0])
        answer=0
        for r in range(self.m):
            for c in range(self.n):
                if board[r][c]=='X':
                    self.dfs(r,c,board)
                    answer+=1
        return answer

    def dfs(self,r,c,board):
        if r<0 or c<0 or r>=self.m or c>=self.n or board[r][c]!='X':
            return
        board[r][c] = '.'
        self.dfs(r+1,c,board)
        self.dfs(r-1,c,board)
        self.dfs(r,c-1,board)
        self.dfs(r,c+1,board)
