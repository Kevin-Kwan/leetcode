class Solution:
    def sumOfGoodNumbers(self, nums: List[int], k: int) -> int:
        n = len(nums)
        sum = 0
        for i in range(n):
            left = i-k
            right = i+k
            if left>=0:
                if nums[left]>=nums[i]:
                    continue
            if right<n:
                if nums[right]>=nums[i]:
                    continue
            sum+=nums[i]
        return sum
