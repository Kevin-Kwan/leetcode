class Solution:
    def largestOddNumber(self, num: str) -> str:
        lastPointer = len(num)-1
        while lastPointer>=0:
            if int(num[lastPointer])%2!=0:
                return num[0:lastPointer+1]
            lastPointer-=1
        return ""
