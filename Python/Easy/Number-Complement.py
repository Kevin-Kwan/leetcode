class Solution:
    def findComplement(self, num: int) -> int:
        binNum = bin(num)[2:]
        binComp = ""
        for i in range(len(binNum)):
            if binNum[i] == '0':
                binComp+='1'
            else:
                binComp+='0'
        return int(binComp, 2)
