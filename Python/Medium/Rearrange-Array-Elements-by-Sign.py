class Solution(object):
    def rearrangeArray(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        posNums = []
        negNums = []
        answer = []
        for num in nums:
            if num>=0:
                posNums.append(num)
            else:
                negNums.append(num)
        for i in range(len(posNums)):
            answer.append(posNums[i])
            answer.append(negNums[i])
        return answer
