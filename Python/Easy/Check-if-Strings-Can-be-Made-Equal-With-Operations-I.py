class Solution:
    def canBeEqual(self, s1: str, s2: str) -> bool:
        n = len(s1)
        for i in range(n-2):
            j = i + 2
            if (s1[i]==s2[i] or s1[i]==s2[j]) and (s1[j]==s2[j] or s1[j]==s2[i]):
                continue
            return False
        return True
