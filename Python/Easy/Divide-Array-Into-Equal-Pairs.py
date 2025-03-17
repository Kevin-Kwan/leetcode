class Solution:
    def divideArray(self, nums: List[int]) -> bool:
        counts = Counter(nums)
        for value in counts.values():
            if value%2!=0:
                return False
        return True
