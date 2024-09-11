class Solution:
    def minBitFlips(self, start: int, goal: int) -> int:
        ans = 0
        diff = start ^ goal
        while diff != 0:
            ans += diff & 1
            diff >>= 1
        return ans
