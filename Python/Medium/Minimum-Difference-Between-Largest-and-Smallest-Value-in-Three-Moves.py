class Solution:
    def minDifference(self, nums: List[int]) -> int:
        n = len(nums)
        if n<=4:
            return 0
        nums.sort()
        first = nums[0]

        return min(nums[-1]-nums[3],nums[-2]-nums[2],nums[-3]-nums[1],nums[-4]-nums[0])
