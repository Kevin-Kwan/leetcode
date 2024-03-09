class Solution:
    def getCommon(self, nums1: List[int], nums2: List[int]) -> int:
        num1p = 0
        num2p = 0
        n = len(nums1)
        m = len(nums2)
        while (num1p<n and num2p<m):
            if nums1[num1p]==nums2[num2p]:
                return nums1[num1p]
            if nums1[num1p]<nums2[num2p]:
                num1p+=1
            else:
                num2p+=1
        return -1
