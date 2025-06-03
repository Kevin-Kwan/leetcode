class Solution:
    def smallestIndex(self, nums: List[int]) -> int:
        for i,num in enumerate(nums):
            if i==self.sumDigits(num):
                return i
        return -1
    
    def sumDigits(self, num):
        sum = 0
        while num>0:
            sum += num%10
            num//=10
        return sum
