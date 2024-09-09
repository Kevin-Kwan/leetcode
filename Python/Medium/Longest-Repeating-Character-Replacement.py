class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        counts = {}
        L = 0
        n = len(s)
        maxSoFar = 0
        maxWin = 0
        for R in range(n):
            counts[s[R]] = counts.get(s[R],0) + 1
            maxSoFar = max(maxSoFar, counts[s[R]])
            if (R-L+1)-maxSoFar>k:
                counts[s[L]]-=1
                L+=1
            else:
                maxWin=max(maxWin,R-L+1)
        return maxWin
