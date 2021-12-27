class Solution(object):
    def runningSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        lol = []
        y = 0
        for x in nums:
            y = y + x
            lol.append(y)
        return lol
