class Solution:
    def minOperations(self, nums: List[int]) -> int:
        counts = Counter(nums)
        answer = 0
        for value in counts.values():
            if value == 1:
                return -1
            answer += value // 3
            if value%3!=0:
                answer+=1
        return answer
