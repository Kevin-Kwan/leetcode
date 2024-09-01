class Solution:
    def construct2DArray(self, original: List[int], m: int, n: int) -> List[List[int]]:
        if m*n < len(original) or m*n > len(original): return []
        ans = [[0 for _ in range(n)] for _ in range(m)]
        row = 0
        col = 0
        for element in original:
            if col == n:
                row+=1
                col = 0
            ans[row][col] = element
            col+=1
        return ans
