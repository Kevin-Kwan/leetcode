class Solution:
    def countPartitions(self, nums: List[int]) -> int:
        total = sum(nums)
        n = len(nums)
        runningSum = 0
        ans = 0
        for i in range(n-1):
            runningSum+=nums[i]
            total-=nums[i]
            if ((total-runningSum)%2==0):
                ans+=1
        return ans
