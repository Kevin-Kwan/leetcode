class Solution:
    def addSpaces(self, s: str, spaces: List[int]) -> str:
        i = 0
        space = 0
        ans = ""
        for i in range(len(s)):
            if space<len(spaces) and i == spaces[space]:
                ans+=' '
                space+=1
            ans+=s[i]
        return ans
