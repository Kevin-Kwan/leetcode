class Solution:
    def minOperations(self, nums: List[int], k: int) -> int:
        count = set()
        i = len(nums)-1
        while (len(count)<k):
            if (nums[i]<=k):
                count.add(nums[i])
            i-=1
        return len(nums)-1-i
