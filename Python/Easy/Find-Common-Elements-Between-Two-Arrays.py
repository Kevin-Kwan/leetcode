class Solution:
    def findIntersectionValues(self, nums1: List[int], nums2: List[int]) -> List[int]:
        set1=set(nums1)
        set2=set(nums2)
        answer = []
        n = len(nums1)
        m = len(nums2)
        nums1count = 0
        for i in range(n):
            if nums1[i] in set2:
                nums1count+=1
        answer.append(nums1count)
        nums2count = 0
        for i in range(m):
            if nums2[i] in set1:
                nums2count+=1
        answer.append(nums2count)
        return answer
