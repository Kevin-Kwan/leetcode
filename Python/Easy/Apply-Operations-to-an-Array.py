class Solution:
    def applyOperations(self, nums: List[int]) -> List[int]:
        n = len(nums)
        ans = []
        for i in range(n-1):
            if nums[i]==0:
                continue
            if nums[i] == nums[i + 1]:
                nums[i]*=2
                nums[i+1]=0
            ans.append(nums[i])
        if nums[n-1]!=0:
            ans.append(nums[n-1])
        return ans + [0] * (n-len(ans))
