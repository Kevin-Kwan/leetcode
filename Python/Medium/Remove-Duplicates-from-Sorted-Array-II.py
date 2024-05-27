class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        n = len(nums)
        currCount = 0
        currNum = None
        realIter = 0
        for i in range(n):
            if currNum != nums[i]:
                currNum = nums[i]
                currCount = 1
            else:
                currCount+=1
            if currCount <= 2:
                nums[realIter] = currNum
                realIter+=1
        return realIter
