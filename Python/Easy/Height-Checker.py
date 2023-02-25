class Solution(object):
    def heightChecker(self, heights):
        """
        :type heights: List[int]
        :rtype: int
        """
        expected = sorted(heights)
        numMismatch = 0
        for i in range(len(heights)):
            if (heights[i]!=expected[i]):
                numMismatch+=1
        return numMismatch
