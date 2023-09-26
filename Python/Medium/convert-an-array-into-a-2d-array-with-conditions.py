class Solution:
    def findMatrix(self, nums: List[int]) -> List[List[int]]:
        numDict = dict()
        answer = []
        for num in nums:
            numDict[num] = numDict.get(num,0)+1
        while (not self.all_values_zero(numDict)):
            newRow = []
            for key, value in numDict.items():
                if (value>0):
                    numDict[key]-=1
                    newRow.append(key)
            answer.append(newRow)
        return answer

    def all_values_zero(self, dictionary):
        for key, value in dictionary.items():
            if value != 0:
                return False
        return True
