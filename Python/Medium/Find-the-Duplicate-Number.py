class Solution(object):
    def findDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        numDict = [False for x in range(len(nums))]
        for num in nums:
            if (numDict[num] is True):
                return num
            else:
                numDict[num] = True
        return nums[0]
        
