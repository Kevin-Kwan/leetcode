class Solution:
    def maxScore(self, s: str) -> int:
        numOnes = s.count('1')
        numZeros = 0
        max_score = 0
        for i in range(len(s) - 1):
            numZeros += s[i] == '0'
            numOnes -= s[i] == '1'
            max_score = max(max_score, numZeros + numOnes)

        return max_score
        
