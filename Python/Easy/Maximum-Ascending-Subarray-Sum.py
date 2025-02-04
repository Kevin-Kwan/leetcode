class Solution:
    def maxAscendingSum(self, nums: List[int]) -> int:
        maxSum = 0
        currSum = nums[0]
        prevNum = nums[0]
        for i in range(1,len(nums)):
            if nums[i]>prevNum:
                currSum+=nums[i]
            else:
                if maxSum<currSum:
                    maxSum = currSum
                currSum = nums[i] 
            prevNum = nums[i]
        if maxSum<currSum:
            maxSum = currSum
        return maxSum
