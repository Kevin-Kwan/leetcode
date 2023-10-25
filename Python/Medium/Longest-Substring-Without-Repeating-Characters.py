class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        charSet = set()
        maxValue = 0
        left = 0
        for i in range(len(s)):
            if (s[i] not in charSet):
                charSet.add(s[i])
                maxValue = max(maxValue, len(charSet))
            else:
                while s[i] in charSet:
                    charSet.remove(s[left])
                    left+=1
                charSet.add(s[i])
        return maxValue

