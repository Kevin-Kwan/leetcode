class Solution:
    def maxProductDifference(self, nums: List[int]) -> int:
        nums.sort()
        print(nums)
        n = len(nums)
        return (nums[n-1]*nums[n-2])-(nums[1]*nums[0])
