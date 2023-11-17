class Solution:
    def minPairSum(self, nums: List[int]) -> int:
        nums.sort()
        n = len(nums)
        max = 0
        for i in range(n//2):
            sum = nums[i]+nums[n-i-1]
            if sum > max:
                max = sum
        return max
