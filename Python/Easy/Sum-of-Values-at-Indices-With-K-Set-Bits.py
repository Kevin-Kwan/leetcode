class Solution:
    def sumIndicesWithKSetBits(self, nums: List[int], k: int) -> int:
        answer = 0
        for i, num in enumerate(nums):
            if i.bit_count() == k:
                answer+=num
        return answer
