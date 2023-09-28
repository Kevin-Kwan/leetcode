class Solution:
    def sortArrayByParity(self, nums: List[int]) -> List[int]:
        nums.sort()
        answer = []
        n = len(nums)
        for num in nums:
            if num%2==0:
                answer.append(num)
        for num in nums:
            if num%2!=0:
                answer.append(num)
        return answer
        
