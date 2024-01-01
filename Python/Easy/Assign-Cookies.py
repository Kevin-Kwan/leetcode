class Solution:
    def findContentChildren(self, g: List[int], s: List[int]) -> int:
        g.sort()
        s.sort()
        G = len(g)
        S = len(s)
        
        child_i = cookie_j = 0
        while child_i < G and cookie_j < S:
            if s[cookie_j] >= g[child_i]:
                child_i += 1
            cookie_j += 1
        
        return child_i
