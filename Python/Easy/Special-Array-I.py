class Solution:
    def isArraySpecial(self, nums: List[int]) -> bool:
        n = len(nums)
        if n == 1:
            return True
        isEven = (nums[0]%2==0)
        for i in range(1,n):
            if (nums[i]%2==0 and isEven) or (nums[i]%2!=0 and not isEven):
                return False
            else:
                isEven = (nums[i]%2==0)
        return True

                
