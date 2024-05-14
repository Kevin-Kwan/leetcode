class Solution:
    def findPermutationDifference(self, s: str, t: str) -> int:
        positions = {}
        ans = 0
        n = len(s)
        for i in range(n):
            positions[s[i]]=i
        for i in range(n):
            ans += abs(positions[t[i]]-i)
        return ans
