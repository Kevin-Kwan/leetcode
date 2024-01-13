class Solution:
    def minSteps(self, s: str, t: str) -> int:
        counts = Counter(s)
        n = len(s)
        for char in t:
            if counts[char]>0:
                counts[char]-=1
                n-=1
        return n
