class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        prefix = nums.copy()
        suffix = nums.copy()
        n = len(nums)
        maxValue = max(nums[0], nums[n-1])
        for i in range(1,n):
            prefix[i] *= prefix[i-1] or 1
            suffix[n-i-1] *= suffix[n-i] or 1
            maxValue = max(max(prefix[i],suffix[n-i-1]),maxValue)
        return maxValue
