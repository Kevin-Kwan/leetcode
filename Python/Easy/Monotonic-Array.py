class Solution:
    def isMonotonic(self, nums: List[int]) -> bool:
        return self.forwardPass(nums) or self.backPass(nums)
    def forwardPass(self, nums: List[int]) -> bool:
        prevNum = nums[0]
        for i in range(1,len(nums)):
            if nums[i]<prevNum:
                return False
            prevNum=nums[i]
        return True
    def backPass(self, nums: List[int]) -> bool:
        prevNum = nums[0]
        for i in range(1,len(nums)):
            if nums[i]>prevNum:
                return False
            prevNum=nums[i]
        return True
