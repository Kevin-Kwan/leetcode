class Solution:
    def uniqueLetterString(self, s: str) -> int:
        index = [[-1, -1] for _ in range(26)]
        res = 0
        n = len(s)
        for i in range(n):
            c = ord(s[i]) - ord('A')
            res += (i - index[c][1]) * (index[c][1] - index[c][0])
            index[c] = [index[c][1], i]
        for c in range(26):
            res += (n - index[c][1]) * (index[c][1] - index[c][0])
        return res
