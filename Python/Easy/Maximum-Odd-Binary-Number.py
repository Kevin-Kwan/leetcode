class Solution:
    def maximumOddBinaryNumber(self, s: str) -> str:
        counts = Counter(s)
        n = len(s)
        if counts['1'] == 0:
            return "0"*n
        return '1'*(counts.get('1',1)-1)+'0'*counts.get('0',0)+'1'
