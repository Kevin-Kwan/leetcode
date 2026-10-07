class Solution(object):
    def minRotations(self, s):
        """
        :type s: str
        :rtype: int
        """
        f = 0
        total = 0
        for c in s:
            t = int(c)
            diff = abs(t-f)
            total += min(diff, 10-diff)
            f = t
        return total 
