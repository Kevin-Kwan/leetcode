class Solution(object):
    def separateDigits(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        answer = []
        for i in nums:
            if i/10==0:
                answer.append(i)
            else:
                temp = str(i)
                for j in range(len(temp)):
                    answer.append(int(temp[j]))
        return answer
