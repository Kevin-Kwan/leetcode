class Solution:
    def luckyNumbers (self, matrix: List[List[int]]) -> List[int]:
        n = len(matrix)
        m = len(matrix[0])
        mins = []
        for row in range(n):
            mins.append(min(matrix[row]))
        maxes = []
        for col in range(m):
            maxCol = 0
            for row in range(n):
                maxCol = max(maxCol,matrix[row][col])
            maxes.append(maxCol)
        return list(set(maxes) & set(mins))
