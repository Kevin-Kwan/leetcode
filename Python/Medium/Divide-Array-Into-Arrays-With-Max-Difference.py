class Solution:
    def divideArray(self, nums: List[int], k: int) -> List[List[int]]:
        nums.sort()
        n = len(nums)
        answer = []
        for i in range(0,n,3):
            if k>=abs(nums[i+2]-nums[i]):
                answer.append(nums[i:i+3])
            else:
                return []
        return answer
