class Solution:
    def getSneakyNumbers(self, nums: List[int]) -> List[int]:
        n = len(nums) - 2
        ans = []
        seen = set()
        for num in nums:
            if num in seen:
                ans.append(num)
            seen.add(num)
        return ans
