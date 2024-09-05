class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        ans = [1 for _ in range(n)]
        prefix = 1
        for i in range(n):
            ans[i] = prefix
            prefix *= nums[i]
        # print(ans)
        suffix = 1
        for i in range(n-1, -1, -1):
            ans[i] *= suffix
            suffix *= nums[i]
        # print(ans)
        return ans
