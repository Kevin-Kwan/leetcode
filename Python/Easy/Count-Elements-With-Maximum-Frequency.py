class Solution:
    def maxFrequencyElements(self, nums: List[int]) -> int:
        counts = Counter(nums)
        answer = 0
        maxFreq = 0
        for value in counts.values():
            if value>maxFreq:
                maxFreq = value
                answer = value
            elif value == maxFreq:
                answer += value
        return answer
