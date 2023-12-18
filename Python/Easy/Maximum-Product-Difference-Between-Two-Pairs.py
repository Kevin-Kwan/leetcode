class Solution:
    def maxProductDifference(self, nums: List[int]) -> int:
        # O(N)
        min1 = min2 = float('inf')
        max1 = max2 = float('-inf')

        for num in nums:
            if num < min1:
                min2 = min1
                min1 = num
            elif num < min2:
                min2 = num

            if num > max1:
                max2 = max1
                max1 = num
            elif num > max2:
                max2 = num

        return max1 * max2 - min1 * min2
        # O(nlogn)
        # nums.sort()
        # return nums[-1] * nums[-2] - nums[0] * nums[1]
