class Solution:
    def titleToNumber(self, columnTitle: str) -> int:
        n = len(columnTitle)
        answer = 0
        inc=1
        for c in reversed(columnTitle):
            answer+=(ord(c)-ord('A')+1)*inc
            inc*=26
        return answer
