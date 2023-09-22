class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        i = 0
        if len(s) is 0:
            return True
        for char in t:
            if i < len(s):
                if s[i] is char:
                    i+=1
            else:
                return i==len(s)
        return i==len(s)
        
