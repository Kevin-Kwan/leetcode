class Solution:
    def numberOfMatches(self, n: int) -> int:
        matches = 0
        while n != 1:
            m = (n if n%2==0 else n-1) // 2
            matches += m
            n-=m
        return matches
