class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        ans = []
        subset = []
        n = len(nums)
        def dfs(i):
            if i>=n:
                ans.append(subset.copy())
                return
            else:
                subset.append(nums[i])
                dfs(i+1)
                subset.pop()
                dfs(i+1)
        dfs(0)
        return ans
