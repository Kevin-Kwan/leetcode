class Solution:
    def minOperations(self, s: str) -> int:
        zeroStart = 0
        oneStart = 0
        for i in range(len(s)):
            if i%2==0:
                if s[i]=='0':
                    oneStart+=1
                else:
                    zeroStart+=1
            else:
                if s[i]=='0':
                    zeroStart+=1
                else:
                    oneStart+=1
        return min(zeroStart,oneStart)
