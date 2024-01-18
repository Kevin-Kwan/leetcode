class Solution:
    def climbStairs(self, n: int) -> int:
        if n == 1 or n == 2:
            return n
        table = [0 for col in range(n)]
        table[0]=1
        table[1]=2
        for i in range(2,n):
            table[i] = table[i-1] + table[i-2]
        return table[n-1]
        
        
