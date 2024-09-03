class Solution:
    def getLucky(self, s: str, k: int) -> int:
        ans = 0
        table = {}
        for c in s:
            if table.get(c,0) == 0:
                table[c]=self.getSum(ord(c)-96)
            ans += table[c]
        while (k-1>0):
            ans = self.getSum(ans)
            k-=1
        return ans

    def getSum(self, num):
        sum = 0
        for digit in str(num):
            sum+=int(digit)
        return sum
