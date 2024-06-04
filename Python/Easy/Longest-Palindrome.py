class Solution:
    def longestPalindrome(self, s: str) -> int:
        charSet = set()
        ans = 0
        for c in s:
            if c in charSet:
                ans+=2
                charSet.remove(c)
            else:
                charSet.add(c)
        if charSet:
            ans+=1
        return ans
