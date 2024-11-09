class Solution:
    def isBalanced(self, num: str) -> bool:
        oddSum = 0
        evSum = 0
        n = len(num)
        for i in range(n):
            if i%2==0:
                evSum+=int(num[i])
            else:
                oddSum+=int(num[i])
        return oddSum == evSum
