class Solution:
    def firstUniqChar(self, s: str) -> int:
        counts = Counter(s)
        n = len(s)
        for i in range(n):
            if counts[s[i]]==1:
                return i
        return -1
