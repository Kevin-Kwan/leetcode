class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        n = len(nums)
        ans = []
        for i, left in enumerate(nums):
            if i > 0 and left == nums[i-1]:
                continue
            mid = i+1
            right = n-1
            while mid < right:
                threeSum = left + nums[mid] + nums[right]
                if threeSum > 0:
                    right-=1
                elif threeSum < 0:
                    mid+=1
                else:
                    ans.append([left, nums[mid], nums[right]])
                    mid+=1
                    while nums[mid] == nums[mid-1] and mid < right:
                        mid+=1
        return ans
