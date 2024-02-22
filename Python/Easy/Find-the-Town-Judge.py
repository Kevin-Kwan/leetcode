class Solution:
    def findJudge(self, n: int, trust: List[List[int]]) -> int:
        trusts = [0 for _ in range(n+1)]
        trusted = [0 for _ in range(n+1)]
        for i in range(len(trust)):
            trusts[trust[i][0]]+=1
            trusted[trust[i][1]]+=1
        for i in range(1,n+1):
            if trusts[i]==0 and trusted[i]==(n-1):
                return i
        return -1
