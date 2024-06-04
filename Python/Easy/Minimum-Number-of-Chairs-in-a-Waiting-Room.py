class Solution:
    def minimumChairs(self, s: str) -> int:
        chairs = 0
        maxC = 0
        for c in s:
            if c == 'E':
                chairs+=1
                maxC = max(maxC,chairs)
            else:
                chairs-=1
        return maxC
