class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        n = len(nums)
        threshold = n//2
        counts = {}
        for i in range(n):
            temp = counts.get(nums[i],0)+1
            if temp > threshold:
                return nums[i]
            counts[nums[i]] = temp
        return 0
