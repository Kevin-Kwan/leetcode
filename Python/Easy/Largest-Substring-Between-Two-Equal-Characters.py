class Solution:
    def maxLengthBetweenEqualCharacters(self, s: str) -> int:
        indexMap = {}
        answer = -1
        n = len(s)
        for i in range(n):
            if (indexMap.get(s[i],-1)==-1):
                indexMap[s[i]]=i
            else:
                answer = max(answer,i-1-indexMap[s[i]])
        return answer
