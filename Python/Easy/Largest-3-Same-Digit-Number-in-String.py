class Solution:
    def largestGoodInteger(self, num: str) -> str:
        n = len(num)
        i=0
        maxString = ""
        maxNum = -1
        while i<n-2:
            if num[i]==num[i+2]==num[i+1] and int(num[i])>maxNum:
                maxNum = int(num[i])
                maxString = num[i:i+3]
            i+=1
        return maxString
