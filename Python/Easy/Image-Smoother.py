class Solution:
    def imageSmoother(self, img: List[List[int]]) -> List[List[int]]:
        m, n = len(img), len(img[0])
        answer = [[0]*n for _ in range(m)]
        sum_table = [[0]*(n+1) for _ in range(m+1)]
        
        # summed-area table
        for i in range(m):
            for j in range(n):
                sum_table[i+1][j+1] = img[i][j] + sum_table[i][j+1] + sum_table[i+1][j] - sum_table[i][j]
        
        # smoother
        for i in range(m):
            for j in range(n):
                r1, c1, r2, c2 = max(0, i-1), max(0, j-1), min(m, i+2), min(n, j+2)
                count = (r2-r1)*(c2-c1)
                total = sum_table[r2][c2] - sum_table[r1][c2] - sum_table[r2][c1] + sum_table[r1][c1]
                answer[i][j] = total // count
        
        return answer
