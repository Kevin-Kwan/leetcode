class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        res = set()
        for i in range(9):
            for j in range(9):
                element = board[i][j]
                if element != '.':
                    rowTuple = (i, element)
                    colTuple = (element, j)
                    subgrid = (i // 3, j // 3, element)
                    if rowTuple in res or colTuple in res or subgrid in res:
                        return False
                    res.add(rowTuple)
                    res.add(colTuple)
                    res.add(subgrid)
        return True
