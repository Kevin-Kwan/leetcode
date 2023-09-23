class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        setNums = {set(nums)}
        i = 1
        while i<=len(nums):
            if i in setNums:
                i+=1
            else:
                return i
        return len(nums) + 1
