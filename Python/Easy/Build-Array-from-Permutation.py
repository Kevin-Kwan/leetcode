class Solution(object):
    def buildArray(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        what = []
        for x in range(len(nums)):
            what.append(nums[nums[x]])
        return what
        
