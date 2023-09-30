class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        for c in s:
            if c in ('(','{','['):
                stack.append(c)
            else:
                if len(stack)==0 or not self.checkPair(stack.pop(),c):
                    return False
        return len(stack)==0
    def checkPair(self, popped, c):
        return (popped=='(' and c==')' or popped=='[' and c==']' or popped=='{' and c=='}')
