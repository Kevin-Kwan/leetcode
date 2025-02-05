class Solution:
    def areAlmostEqual(self, s1: str, s2: str) -> bool:
        s1chars = {}
        s2chars = {}
        n = len(s1)
        m = len(s2)
        notEqualCount = 0
        if (n != m): return False
        for i in range(n):
            s1chars[s1[i]]=s1chars.get(s1[i],0)+1
            s2chars[s2[i]]=s2chars.get(s2[i],0)+1
            if s1[i]!=s2[i]:
                notEqualCount+=1
                if notEqualCount>2:
                    return False
        if notEqualCount%2==0 and (s1chars==s2chars):
            return True
        return False
