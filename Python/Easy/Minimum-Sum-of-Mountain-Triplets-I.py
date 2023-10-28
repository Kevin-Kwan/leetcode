class Solution:
    def minimumSum(self, nums: List[int]) -> int:
        answer = 2500
        n = len(nums)
        for i in range(n):
            for j in range(i+1,n):
                for k in range(j+1,n):
                    if (nums[i] < nums[j] and nums[k] < nums[j]) and (nums[i]+nums[j]+nums[k]<answer):
                        answer = nums[i]+nums[j]+nums[k]
        if (answer==2500):
            return -1
        return answer
