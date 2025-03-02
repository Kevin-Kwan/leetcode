class Solution:
    def mergeArrays(self, nums1: List[List[int]], nums2: List[List[int]]) -> List[List[int]]:
        nums = {}
        ans = []
        for pair in nums1:
            nums[pair[0]]=pair[1]
        
        for pair in nums2:
            nums[pair[0]]=nums.get(pair[0],0)+pair[1]
        
        for key, value in sorted(nums.items()):
            ans.append([key,value])
            
        return ans
