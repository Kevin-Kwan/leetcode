class Solution:
    def partitionString(self, s: str) -> int:
        left = 0
        n = len(s)
        answer = 1
        unique = set()
        for char in s:
            if char in unique:
                unique = set()
                answer+=1
            unique.add(char)
        return answer
