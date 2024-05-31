class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        count = Counter(nums)
        ans = []
        for num in nums:
            if count[num]==1:
                ans.append(num)
        return ans
