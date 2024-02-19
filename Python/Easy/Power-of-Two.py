class Solution(object):
    def isPowerOfTwo(self, n):
        """
        :type n: int
        :rtype: bool
        """
        if n == 0:
            return False
        while n > 0:
            if n == 1:
                return True
            if n%2 != 0:
                break
            n //= 2
        return False
