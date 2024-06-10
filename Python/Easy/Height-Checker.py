class Solution:
    def heightChecker(self, heights: List[int]) -> int:
        expected = sorted(heights)
        numMismatch = 0
        for i in range(len(heights)):
            numMismatch+=(heights[i]!=expected[i])
        return numMismatch
