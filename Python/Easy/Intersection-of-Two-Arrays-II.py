class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        counts = Counter(nums1)
        ans = []
        for num in nums2:
            if counts[num]>0:
                counts[num]-=1
                ans.append(num)
        return ans
