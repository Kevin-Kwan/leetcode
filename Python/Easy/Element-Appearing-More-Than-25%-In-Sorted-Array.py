class Solution:
    def findSpecialInteger(self, arr: List[int]) -> int:
        n = len(arr)
        neededCount = n//4
        currNum = -1
        count = -1
        for number in arr:
            if number!=currNum:
                currNum = number
                count = 1
            elif count>neededCount:
                return currNum
            count+=1
        return currNum
