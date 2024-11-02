class Solution:
    def makeFancyString(self, s: str) -> str:
        ans = ""
        currCount = 1
        currChar = ''
        for c in s:
            if c == currChar:
                currCount+=1
                if currCount >= 3:
                    continue
            else:
                currChar = c
                currCount = 1
            ans+=c
        return ans
