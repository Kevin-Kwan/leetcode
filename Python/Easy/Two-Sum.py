class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        storage = {}
        n = len(nums)
        for i in range(n):
            other = target-nums[i]
            if other in storage:
                return [storage[other],i]
            storage[nums[i]]=i
        
