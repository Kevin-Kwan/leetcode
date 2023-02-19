class Solution(object):
    def alternateDigitSum(self, n):
        """
        :type n: int
        :rtype: int
        """
        answer = 0
        temp = str(n)
        for i in range(len(temp)):
            answer += int(temp[i]) if i%2==0 else -int(temp[i])
        return answer
