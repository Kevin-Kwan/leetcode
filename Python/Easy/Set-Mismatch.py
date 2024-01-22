class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        counts = {}
        n = len(nums)
        answer = [0 for _ in range(2)]
        for num in nums:
            counts[num] = counts.get(num,0)+1
            if counts[num] == 2:
                answer[0] = num
        for i in range (1,n+1):
            if counts.get(i,0)==0:
                answer[1] = i
                break
        return answer
