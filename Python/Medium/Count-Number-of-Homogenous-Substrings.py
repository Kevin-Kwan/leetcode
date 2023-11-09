class Solution:
    def countHomogenous(self, s: str) -> int:
        MOD = 10**9 + 7
        count = 0
        prev = ''
        length = 0
        for c in s:
            if c == prev:
                length += 1
            else:
                count += (length*(length+1))//2
                prev = c
                length = 1
        count += (length*(length+1))//2
        return count % MOD
