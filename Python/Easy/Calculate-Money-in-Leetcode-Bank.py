class Solution:
    def totalMoney(self, n: int) -> int:
        numWeeks = n//7
        extraDays = n%7
        start = numWeeks+1
        end = extraDays + numWeeks
        extra = ((start+end)*(end-start+1))//2
        extra7s = (numWeeks-1)*(numWeeks)//2
        return 28*numWeeks+7*extra7s+extra
